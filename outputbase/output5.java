package outputbase;

class A {
    String s = "Class A";
    void show() { System.out.println("Method A"); }
}

class B extends A {
    String s = "Class B";
    void show() { System.out.println("Method B"); }
}

public class output5 {
    public static void main(String[] args) {
        A obj = new B(); // Upcasting
        
        obj.show();      // Method Call
        System.out.println(obj.s); // Variable Access
    }
}