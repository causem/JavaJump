package concurrency.task2;

public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Thread runs (extends): " + Thread.currentThread().getName());
    }
}
