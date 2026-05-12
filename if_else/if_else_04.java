package if_else;
import java.util.Scanner;

public class if_else_04 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int age = sc.nextInt();
            if(age >= 18){
                System.out.println("Eligible for Voting");
            } else {
                System.out.println("Not Eligible");
            }
        }
    }
}
