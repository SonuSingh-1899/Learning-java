package CollectionFramework;

import java.util.ArrayList;
import java.util.Scanner;

class Product {
    int id;
    String name;
    double price;

    Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return id + " - " + name + " : ₹" + price;
    }
}

public class cartsystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Available products
        ArrayList<Product> store = new ArrayList<>();
        store.add(new Product(1, "Laptop", 55000));
        store.add(new Product(2, "Mobile", 20000));
        store.add(new Product(3, "Headphones", 1500));
        store.add(new Product(4, "Keyboard", 1200));

        // User cart
        ArrayList<Product> cart = new ArrayList<>();

        while (true) {
            System.out.println("\n=== Online Store ===");
            System.out.println("1. View Products");
            System.out.println("2. Add to Cart");
            System.out.println("3. View Cart");
            System.out.println("4. Remove from Cart");
            System.out.println("5. Checkout & Exit");
            System.out.print("Choose option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("\nAvailable Products:");
                    for (Product p : store) {
                        System.out.println(p);
                    }
                    break;

                case 2:
                    System.out.print("Enter Product ID to add: ");
                    int id = sc.nextInt();
                    boolean found = false;
                    for (Product p : store) {
                        if (p.id == id) {
                            cart.add(p);
                            System.out.println(p.name + " added to cart ✅");
                            found = true;
                            break;
                        }
                    }
                    if (!found) System.out.println("❌ Product not found!");
                    break;

                case 3:
                    System.out.println("\nYour Cart:");
                    double total = 0;
                    if (cart.isEmpty()) {
                        System.out.println("Cart is empty!");
                    } else {
                        for (Product p : cart) {
                            System.out.println(p);
                            total += p.price;
                        }
                        System.out.println("Total: ₹" + total);
                    }
                    break;

                case 4:
                    System.out.print("Enter Product ID to remove: ");
                    int rid = sc.nextInt();
                    Product toRemove = null;
                    for (Product p : cart) {
                        if (p.id == rid) {
                            toRemove = p;
                            break;
                        }
                    }
                    if (toRemove != null) {
                        cart.remove(toRemove);
                        System.out.println(toRemove.name + " removed from cart ❌");
                    } else {
                        System.out.println("Product not in cart!");
                    }
                    break;

                case 5:
                    System.out.println("\nFinal Cart Checkout:");
                    double sum = 0;
                    for (Product p : cart) {
                        System.out.println(p);
                        sum += p.price;
                    }
                    System.out.println("Total Amount: ₹" + sum);
                    System.out.println("✅ Thank you for shopping!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
