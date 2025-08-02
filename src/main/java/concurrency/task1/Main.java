package concurrency.task1;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new TaskGenerator());
        thread.start();
        thread.join();
    }
}
