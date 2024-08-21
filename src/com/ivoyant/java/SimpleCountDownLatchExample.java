package com.ivoyant.java;

import java.util.concurrent.CountDownLatch;

public class SimpleCountDownLatchExample {

    public static void main(String[] args) {
        CountDownLatch latch = new CountDownLatch(3);

        Thread task1 = new Thread(new Demo(latch));
        Thread task2 = new Thread(new Demo(latch));
        Thread task3 = new Thread(new Demo(latch));

        task1.start();
        task2.start();
        task3.start();

        try {
            latch.await();
            System.out.println("All tasks are done. Main thread can proceed.");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
class Demo implements Runnable {
    private final CountDownLatch latch;
    public Demo(CountDownLatch latch) {

        this.latch = latch;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " started working.");
        try {
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName() + " finished working.");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } finally {
            latch.countDown();
        }
    }
}

