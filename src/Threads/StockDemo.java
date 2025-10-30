package Threads;

public class StockDemo {
    public static void main(String[] args) {
        // Create and start multiple stock updater threads
        Thread t1 = new Thread(new Stock("TCS", 5), "Stock-Thread-1");
        Thread t2 = new Thread(new Stock("INFY", 5), "Stock-Thread-2");
        Thread t3 = new Thread(new Stock("RELIANCE", 5), "Stock-Thread-3");

        t1.start();
        t2.start();
        t3.start();

        // Lambda thread for background logging
        Thread logger = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("📊 System Logger: Market data streaming smoothly...");
                try {
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                    System.out.println("Logger interrupted!");
                    Thread.currentThread().interrupt();
                }
            }
        });
        logger.start();
    }
}
