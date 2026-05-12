package loops_in_java;

import java.util.Scanner;

public class loops_04 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            for(int i = 2; i <= n; i += 2){
                System.out.println(i);
            }
        }
    }
}
