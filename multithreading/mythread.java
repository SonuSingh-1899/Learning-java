public class mythread extends Thread{
    @Override
    public synchronized void run(){
        System.out.println(Thread.currentThread());
    }
    public static void main(String[] args) throws InterruptedException {
        mythread t1 = new mythread();
        mythread t2 = new mythread();
        mythread t3 = new mythread();
        t1.setName("Worker-1");
        t2.setName("Worker-2");
        t3.setName("Worker-3");
        t1.start();
        t2.start();
        t3.start();
        // t1.join();
        // t2.join();
        // t3.join();
        System.out.println(Thread.currentThread());

    }
}
