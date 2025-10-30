package Threads;

public class UsingRunnable implements Runnable {

    int high, low;
    String msg;
    Thread thread;

    public UsingRunnable(int high, int low, String msg) {
        super();
        this.high = high;
        this.low = low;
        this.msg = msg;
    }

    @Override
    public void run() {
        for (int i = low; i <= high; i++) {
            try {
                System.out.println(msg + ": " + i);
                Thread.sleep(100); // Pause for 100 milliseconds
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e.getMessage());
                Thread.currentThread().interrupt(); // Restore interrupt status
                break;
            }
        }
    }
}