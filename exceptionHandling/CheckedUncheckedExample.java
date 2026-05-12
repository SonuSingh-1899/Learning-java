package exceptionHandling;

import java.io.*;

public class CheckedUncheckedExample {

    public static void main(String[] args) {

        System.out.println(" CHECKED EXCEPTION ");
        try {
            FileReader file = new FileReader("file.txt"); 
            int data = file.read();
            System.out.println("Data read from file: " + data);
            file.close();
        } catch (FileNotFoundException e) {
            System.out.println("Checked Exception caught: File not found!");
        } catch (IOException e) {
            System.out.println("IOException occurred!");
        }

        System.out.println("\n UNCHECKED EXCEPTION ");
        try {
            int[] arr = {1, 2, 3};
            System.out.println("Accessing index 5: " + arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Unchecked Exception caught: Index out of bounds!");
        }

        System.out.println("\n=== PROGRAM CONTINUES AFTER EXCEPTIONS ===");
    }
}
