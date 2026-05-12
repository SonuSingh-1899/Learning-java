package array;
import java.util.Scanner;
public class arrays2ndtype {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("enter array size :: ");
            int size = sc.nextInt();
            int[] marks = new int[size];
            System.out.println("enter array eliment ");
            for(int i=0;i<size;i++ ){
                marks[i] = sc.nextInt();
            }
            for(int i=0;i<size;i++){
                System.out.println(marks[i]);
            }
        }
    }
}
