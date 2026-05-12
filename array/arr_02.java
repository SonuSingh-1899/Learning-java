package array;
import java.util.*;
public class arr_02 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("enter no of rows : ");
            int rows = sc.nextInt();
            System.out.print("enter no of cols : ");
            int cols = sc.nextInt();

            int[][] numbers = new int[rows][cols];
            
            System.out.println("enter your 2D array :: ");

            for(int i=0;i<rows;i++){
                for(int j=0;j<cols;j++){
                    numbers[i][j] = sc.nextInt();
                }
            }

            System.out.println("enter X : ");
            int x = sc.nextInt();
            // output
            for(int i=0;i<rows;i++){
                for(int j=0;j<cols;j++){
                    if(numbers[i][j] == x){
                        System.out.println("your x is found at index :: "+i+" "+j);
                    }
                }
                System.out.println();
            }
        }
    }  
}