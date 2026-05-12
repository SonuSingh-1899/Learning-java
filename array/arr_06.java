package array;

import java.util.Scanner;

public class arr_06 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("enter rows ::");
            int rows = sc.nextInt();
            System.out.print("enter colns ::");
            int cols = sc.nextInt();

            int[][] numbers = new int[rows][cols];
            System.out.println("enter your array elenments :: ");

            for(int i=0;i<rows;i++){
                for(int j=0;j<cols;j++){
                    numbers[i][j] = sc.nextInt();
                }
            }
            int sum = 0;
            // output
            for(int i=0;i<rows;i++){
                for(int j=0;j<cols;j++){
                    sum = sum + numbers[i][j];
                }
            }
            System.out.println("sum of your 2D array :: "+sum);
        }
    }
}
