package Threads;

import java.util.Random;

public class Stock implements Runnable {
    private String stockName;
    private int updatesCount;
    private Random random = new Random();

    public Stock(String stockName, int updatesCount) {
        this.stockName = stockName;
        this.updatesCount = updatesCount;
    }

    @Override
    public void run() {
        for (int i = 1; i <= updatesCount; i++) {
            try {
                double price = 100 + random.nextDouble() * 20; // Simulate stock price ₹100–₹120
                System.out.println(Thread.currentThread().getName() + 
                                   " | " + stockName + " price update " + i + ": ₹" + String.format("%.2f", price));
                Thread.sleep(1000); // Wait 1 second before next update
            } catch (InterruptedException e) {
                System.out.println(stockName + " thread interrupted: " + e.getMessage());
                Thread.currentThread().interrupt();
                break;
            }
        }
        System.out.println(stockName + " updates completed ✅");
    }
}
