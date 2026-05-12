package pattern_printing;

public record ques_08() {
    public static void main(String[] args) {
        int n=5;
        for(int i = 1; i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            // forst half numbers
            for(int j=i;j>=1; j--){
                System.out.print("*");
            }
            // second half numbers
            for(int j=2;j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        // second half 
        for(int i = n; i>=1;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            // forst half numbers
            for(int j=i;j>=1; j--){
                System.out.print("*");
            }
            // second half numbers
            for(int j=2;j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
