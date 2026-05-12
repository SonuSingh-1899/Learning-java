// this is factorial program!
import java.util.Scanner;
public class dun_02 {

    public static int fact(int N){
        int factorial = 1;
        for(int i=1;i<=N;i++){
         factorial = factorial * i;
        }
        return factorial;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("enter yout no :: ");
            int n = sc.nextInt();
            System.out.println("factorial of your number is : "+fact(n));
        }
    }
}
