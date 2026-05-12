import java.util.Scanner;

class Myexception extends Exception {
    public Myexception(String message) {
        super(message);
    }
}

public class ques_02 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int no = sc.nextInt();
            
            if (no > 100) {
                throw new Myexception("Number should not be greater than 100!");
            }
            
            System.out.println("You entered: " + no);
            
        } catch (Myexception e) {
            System.out.println("Custom Exception: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Other Exception: " + e);
        }

        System.out.println("Code run successfully");
    }
}
