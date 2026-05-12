package constructor;

public class Test {
    public static void main(String[] args) {
        student sc = new student("sonu",18,305);
        String age  = sc.getAge();
        System.out.println("age : "+age);
    }
}
