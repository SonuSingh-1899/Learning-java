package array;
import java.util.*;
public class arr_03 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("enter size of array : ");
            int size = sc.nextInt();

            int[] box = new int[size];
            for(int i=0;i<size;i++){
                box[i] = sc.nextInt();
            }

            int max = box[0];
            int min = box[0];
            for(int i=0;i<size;i++){
                if(box[i]> max){
                    max = box[i];
                }
                if(box[i]< max){
                    min = box[i];
                }
            }
            System.out.println("your max value of array is : "+ max);
            System.out.println("your min value of array is : "+ min);
        }
    }
}
