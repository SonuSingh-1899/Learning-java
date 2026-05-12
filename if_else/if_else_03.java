package if_else;
import java.util.Scanner;

public class if_else_03 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a > b){
                System.out.println(a + " is Larger");
            } else {
                System.out.println(b + " is Larger");
            }
        }
    }
}
