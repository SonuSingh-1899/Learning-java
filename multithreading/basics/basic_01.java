package basics;


class threadname extends Thread {
    private String Threadname;

    public  threadname(String name){
        this.Threadname = name;
    }
        @Override
        public void run(){
            try {
            System.out.println("thread name is : " + Threadname);
            System.out.println(threadname.currentThread().getName());
                Thread.sleep(7000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

public class basic_01 {
    public static void main(String[] args) throws InterruptedException {
        threadname t1 = new threadname("sonu darling");
        threadname t2 = new threadname("sandeep darling");

        t1.setName("thread-sonu");
        t2.setName("thread-sandeep");
        t1.start();
        t1.join();
        t2.start();
    }
}
