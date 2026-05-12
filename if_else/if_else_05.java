package if_else;
import java.util.Scanner;

public class if_else_05 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int marks = sc.nextInt();
            if(marks >= 33){
                System.out.println("Pass");
            } else {
                System.out.println("Fail");
            }
        }
    }
}
