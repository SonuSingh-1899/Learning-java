package if_else;
import java.util.Scanner;

public class if_else_01 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            if(n >= 0){
                System.out.println("Positive Number");
            } else {
                System.out.println("Negative Number");
            }
        }
    }
}
