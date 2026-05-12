import java.util.Scanner;
public class myscanner {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter your age");
            int age  = sc.nextInt();
            System.out.println("your age is " + age);
            int firstno = sc.nextInt();
            long secondno = sc.nextLong();
            int result = (int)(firstno+secondno);
            System.out.println("you result is :: "+result);
        }
    }
}
