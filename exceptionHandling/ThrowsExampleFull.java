package exceptionHandling;

import java.io.*;

// Demonstrating throws with a method that can throw IOException
public class ThrowsExampleFull {

    // Method declares that it may throw IOException
    static void readFile() throws IOException {
        System.out.println("Trying to read a file...");
        FileReader file = new FileReader("not_exist.txt"); // File does not exist
        int data = file.read(); // This may throw IOException
        System.out.println("Data read from file: " + data);
        file.close();
    }

    public static void main(String[] args) {

        System.out.println("=== THROWS Example ===");

        try {
            readFile(); // calling method that throws IOException
        } catch (IOException e) {
            System.out.println("Caught Exception: File not found or cannot read file!");
            System.out.println("Exception Message: " + e.getMessage());
        }

        System.out.println("Program continues after handling exception.");
    }
}
