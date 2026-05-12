public class fun_03 {
    public static int sum(int a, int b){
        return a+b;
    }
    public static String name(String name){
        return name.trim().toUpperCase();
    }
    public static void main(String[] args) {
        int sumofno = sum(2,5);
        System.out.println("sum of two no is :: "+sumofno);
        String name = name("sonu");
        System.out.println("your updated name is : "+name);
    }
}
