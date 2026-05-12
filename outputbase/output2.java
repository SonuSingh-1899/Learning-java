package outputbase;

class Counter {
    int count = 0;
    public void increment() {
        count++; // Yeh ek atomic operation nahi hai
    }
}

public class output2 {
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();
        
        Thread t1 = new Thread(() -> {
            for(int i=0; i<1000; i++) c.increment();
        });
        
        Thread t2 = new Thread(() -> {
            for(int i=0; i<1000; i++) c.increment();
        });
        
        t1.start();
        t2.start();
        
        t1.join(); // Main thread waits for t1
        t2.join(); // Main thread waits for t2
        
        System.out.println("Final Count: " + c.count);
    }
}