package pattern_printing;

public class ques_04 {

    public static void main(String[] args) {
        for(int i = 1; i<=5;i++){
            for(int j = 1; j<=i;j++){
                // System.out.print(" "+num);
                int num = i+j;

                if(num%2==0){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println();
        } 
    }
}
