import java.util.Scanner;
public class if_else {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("enter a :: ");
            int a = sc.nextInt();
            System.out.print("enter b :: ");
            int b = sc.nextInt();
            System.out.print("enter c :: ");
            int c = sc.nextInt();

            if(a>b && a>c){
                System.out.println("a is gretest no ");
            }
           else if(b>a && b>c){
                System.out.println("b is gretest no ");
            }
            if(c>a && c>b){
                System.out.println("c is gretest no ");
            }
        }
    }
}
