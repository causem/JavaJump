package concurrency.task2;

public class MainManyThreads {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();
        MyThread t4 = new MyThread();
        MyThread t5 = new MyThread();

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

        Thread r1 = new Thread(new MyRunnable());
        Thread r2 = new Thread(new MyRunnable());
        Thread r3 = new Thread(new MyRunnable());
        Thread r4 = new Thread(new MyRunnable());
        Thread r5 = new Thread(new MyRunnable());

        r1.start();
        r2.start();
        r3.start();
        r4.start();
        r5.start();
    }
}
