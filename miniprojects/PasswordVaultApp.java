package miniprojects;

import java.util.Scanner;

/** Encapsulated User Account */
class UserAccount {
    private String username;
    private String password;
    private String secret = ""; // protected data

    // Getter (read-only demo) & Setter for username
    public String getUsername() {
        return username;
    }
    public boolean setUsername(String username) {
        if (username == null || username.trim().isEmpty()) {
            System.out.println("❌ Username खाली नहीं होना चाहिए.");
            return false;
        }
        this.username = username.trim();
        return true;
    }

    // Password: write-only (no getter for security)
    public boolean setPassword(String password) {
        if (password == null) {
            System.out.println("❌ Password null नहीं हो सकता.");
            return false;
        }
        // Basic validation: length >= 6, at least 1 digit
        boolean hasDigit = false;
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) { hasDigit = true; break; }
        }
        if (password.length() < 6 || !hasDigit) {
            System.out.println("❌ Password कम से कम 6 chars और 1 digit होना चाहिए.");
            return false;
        }
        this.password = password;
        return true;
    }

    // Verify login (controlled access)
    public boolean verify(String username, String password) {
        return this.username != null && this.password != null
                && this.username.equals(username) && this.password.equals(password);
    }

    // Secret (protected data) via getter/setter
    public String getSecret() {
        return secret;
    }
    public void setSecret(String secret) {
        this.secret = secret;
    }
}

/** Main App */
public class PasswordVaultApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UserAccount account = new UserAccount();

        System.out.println("🔐 Password-Protected Vault");
        System.out.println("---------------------------");

        // Step 1: Registration with validation loops using setters
        while (true) {
            System.out.print("Set Username: ");
            String u = sc.nextLine();
            if (account.setUsername(u)) break; // valid -> exit loop
        }
        while (true) {
            System.out.print("Set Password: ");
            String p = sc.nextLine();
            if (account.setPassword(p)) break; // valid -> exit loop
        }
        System.out.println("✅ Account created successfully!\n");

        // Step 2: Login (while loop until success or attempts finished)
        int attemptsLeft = 3;
        boolean loggedIn = false;
        while (attemptsLeft > 0 && !loggedIn) {
            System.out.print("Login Username: ");
            String lu = sc.nextLine();
            System.out.print("Login Password: ");
            String lp = sc.nextLine();

            if (account.verify(lu, lp)) {
                loggedIn = true;
                System.out.println("✅ Access Granted. Welcome, " + account.getUsername() + "!\n");
            } else {
                attemptsLeft--;
                System.out.println("❌ Invalid credentials. Attempts left: " + attemptsLeft);
            }
        }

        if (!loggedIn) {
            System.out.println("🚫 Too many failed attempts. Exiting...");
            sc.close();
            return;
        }

        // Step 3: Vault menu (protected area)
        while (true) {
            System.out.println("====== VAULT MENU ======");
            System.out.println("1) Save/Update Secret");
            System.out.println("2) View Secret");
            System.out.println("3) Logout");
            System.out.print("Choose: ");

            String choice = sc.nextLine().trim();
            switch (choice) {
                case "1":
                    System.out.print("Enter your secret note: ");
                    String note = sc.nextLine();
                    account.setSecret(note);
                    System.out.println("💾 Secret saved!\n");
                    break;
                case "2":
                    String current = account.getSecret();
                    if (current.isEmpty()) {
                        System.out.println("📭 No secret saved yet.\n");
                    } else {
                        System.out.println("🔎 Your Secret: " + current + "\n");
                    }
                    break;
                case "3":
                    System.out.println("👋 Logged out. Bye!");
                    sc.close();
                    return;
                default:
                    System.out.println("❓ Invalid option. Try again.\n");
            }
        }
    }
}
