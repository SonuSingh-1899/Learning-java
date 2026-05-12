package outputbase;

public class output6 {
    public static int test() {
        int i = 10;
        try {
            return i;
        } finally {
            i = 20;
            System.out.print("Finally ");
        }
    }
    public static void main(String[] args) {
        System.out.println(test());
    }
}