import java.util.Scanner;
public class ternary {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("enter name :: ");
            String name = sc.next();
            System.out.print("enter heroname :: ");
            String heroname = sc.next();
            String result = name.equals(heroname) ? "this is correct" : "this is not correct";
            System.out.println(result);
        }
    }
}
