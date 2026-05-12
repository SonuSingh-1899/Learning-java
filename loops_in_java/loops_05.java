package loops_in_java;

import java.util.Scanner;

public class loops_05 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int i = 1;
            do{
                System.out.println(n + " x " + i + " = " + (n * i));
                i++;
            } while(i <= 10);
        }
    }
}
