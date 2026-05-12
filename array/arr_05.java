package array;

import java.util.Scanner;

public class arr_05 {
    public static void main(String[] args) {
         try (Scanner sc = new Scanner(System.in)) {
            System.out.print("enter size of array : ");
            int size = sc.nextInt();

            int[] box = new int[size];
            for(int i=0;i<size;i++){
                box[i] = sc.nextInt();
            }

            int even = 0;
            int odd = 0;
         for(int i=0;i<size;i++){
            if(box[i]%2==0){
                even++;
            }else{
                odd++;
            }
         }
         System.out.println("even no is : "+even);
         System.out.println("odd no is : "+odd);
        }
    }
}
