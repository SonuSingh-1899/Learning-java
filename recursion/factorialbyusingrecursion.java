package recursion;
import java.util.*;
public class factorialbyusingrecursion {

    public static int fact(int n){
        if(n==1){
            return 1;
        }
        int fact1 = fact(n-1);
        int factn = fact1*n;
        return factn;
        
    }
    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("enter your number :: ");
            int n = sc.nextInt();
            int fun = fact(n);
            System.out.println(fun);
            
        }   
    }
}
