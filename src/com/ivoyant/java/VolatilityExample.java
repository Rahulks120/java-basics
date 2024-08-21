package com.ivoyant.java;

public class VolatilityExample {
    private volatile int count = 0;
//    AtomicInteger count = new AtomicInteger(0);
    public void increment() {
//       count.incrementAndGet();
        count++;}
    public int getCount() {
        return count;
    }

    public static void main(String[] args) {
        VolatilityExample counter = new VolatilityExample();

        Runnable incrementTask = () -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        };
        Thread thread1 = new Thread(incrementTask);
        Thread thread2 = new Thread(incrementTask);
        Thread thread3 = new Thread(incrementTask);
        Thread thread4 = new Thread(incrementTask);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        try {
            thread1.join();
            thread2.join();
            thread3.join();
            thread4.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Final count: " + counter.getCount());
    }
}

