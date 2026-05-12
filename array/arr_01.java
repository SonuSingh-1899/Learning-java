package array;
import java.util.Scanner;
public class arr_01 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("enter size ir array :: ");
            int size = sc.nextInt();
            System.out.print("enter values of array :: ");
            int numbers[] = new int[size];
            for(int i=0;i<size;i++){
                numbers[i] = sc.nextInt();
            }
            System.out.print("enter X ::");
            int x = sc.nextInt();
            for(int i=1;i<size;i++){
                if(numbers[i] == x){
                    System.out.println("your x element are found on index : "+ i);
                }
            }
        }
    }
}
