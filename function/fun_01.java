import java.util.Scanner;

public class fun_01 {
    public static int printProduct(int x1,int x2){
     int result = x1 + x2;
     return result;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("enter no1 : ");
            int no1 = sc.nextInt();
            System.out.print("enter no2 : ");
            int no2 = sc.nextInt();
            System.out.println("sum is :: "+printProduct(no1,no2));
        }
    }
}
