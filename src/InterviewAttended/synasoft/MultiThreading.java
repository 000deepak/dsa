package InterviewAttended.synasoft;

public class MultiThreading {
    public static void main(String[] args) {
        MyRunnable r = new MyRunnable();
        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);

        t1.start();
        t2.start();
    }
}
class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("multi-threading");
    }
}
