package outputbase;

class Worker extends Thread {
    boolean keepRunning = true; // Volatile nahi hai

    public void run() {
        while (keepRunning) {
            // Loop chalta rahega
        }
        System.out.println("Worker stopped");
    }
}

public class output3 {
    public static void main(String[] args) throws InterruptedException {
        Worker w = new Worker();
        w.start();
        
        Thread.sleep(1000); // 1 second wait
        w.keepRunning = false; // Main thread ne flag false kar diya
        System.out.println("Main: Maine false set kar diya hai");
    }
}