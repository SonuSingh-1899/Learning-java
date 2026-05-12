import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            boolean istrue = false;

            while (!istrue) {
            System.out.print("enter A ::");
            int A = sc.nextInt();
            System.out.print("enter B ::");
            int B = sc.nextInt();
            int C = 0;
            C = A+B;
            System.out.println("sum of both number is :: "+C);
            sc.nextLine();
            String input = sc.nextLine();
            if(input.isEmpty()){
                continue;
            }else if (input.equalsIgnoreCase("exit")){
                istrue = true;
            }
            }
        }
    }
}
