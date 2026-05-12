package if_else;
import java.util.Scanner;

public class if_else_02 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            if(n % 2 == 0){
                System.out.println("Even Number");
            } else {
                System.out.println("Odd Number");
            }
        }
    }
}
