package recursion;

import java.util.Scanner;
public class first {
    
    public static void runfun(int i,int n, int sum){
        if(i==n){
            sum = sum +n;
            System.out.println("sum is "+sum);
            return;
        }
        sum = sum + i;
        runfun(i+1, n, sum);
        
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("enter your number :: ");
            int n= sc.nextInt();
            runfun(1,n,0);
        }
        
    }
}
