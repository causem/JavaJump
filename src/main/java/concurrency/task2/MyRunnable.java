package concurrency.task2;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread runs (Runnable): " + Thread.currentThread().getName());
    }
}
