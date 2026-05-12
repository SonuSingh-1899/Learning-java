package outputbase;

class output7 extends Thread {
    public void run(){
        System.out.println("Run");
        System.out.println(Thread.activeCount());
    }
    public static void main(String[] args) throws Exception {
        Test t = new Test();
        t.start();
        Thread.sleep(1000);
        System.out.println("Main");
    }
}
