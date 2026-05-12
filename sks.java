import java.util.function.Predicate;

public class sks {
  public static void main(String[] args) {
    Thread t1 = new Thread(() -> System.out.println("hellow"));

    Mathoperation sumoperation = (a, b) -> a + b;
    Mathoperation substractoperation = (a,b) -> a - b;
    int res = sumoperation.operate(2, 4); 
    System.out.println(res); 

    // predicate --> functional interface 

    Predicate<Integer> iseven = x -> x % 2 == 0;
    System.out.println(iseven.test(4));
    Predicate<String> check = x -> x.startsWith("A");
    System.out.println(check.test("nkit"));
  }
    
}
    

interface Mathoperation {
    int operate(int a, int b);
}
