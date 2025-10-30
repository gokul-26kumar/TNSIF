package Threads;

public class RunnableDemo {

    public static void main(String[] args) {
        // Using your custom Runnable implementation
        UsingRunnable obj = new UsingRunnable(4, 0, "hello");
        Thread thread1 = new Thread(obj);
        thread1.start();

        // Using anonymous class
        Runnable anonymousRunnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnable with Anonymous Class");
            }
        };
        Thread thread2 = new Thread(anonymousRunnable);
        thread2.start();

        // Using lambda expression
        Runnable lambdaRunnable = () -> {
            System.out.println("Runnable with Lambda Expression");
        };
        Thread thread3 = new Thread(lambdaRunnable);
        thread3.start();
    }
}