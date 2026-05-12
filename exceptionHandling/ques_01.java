package exceptionHandling;

public class ques_01 {
    public static void main(String[] args) {
        int arr[] = new int[5];
        System.out.println("this is run");
        try {
            System.out.println(arr[7]);
        } catch (Exception e) {
            System.out.println("try again vailed info ");
        }finally {
            System.out.println("me to run krunga hmesha ");
        }
        System.out.println("this is complate!");
    }
}
