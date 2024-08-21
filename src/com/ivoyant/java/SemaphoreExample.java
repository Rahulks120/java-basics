package com.ivoyant.java;
import java.util.concurrent.Semaphore;
public class SemaphoreExample {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(2);

        Thread thread1 = new Thread(new Work(semaphore), "Thread-1");
        Thread thread2 = new Thread(new Work(semaphore), "Thread-2");
        Thread thread3 = new Thread(new Work(semaphore), "Thread-3");
        Thread thread4 = new Thread(new Work(semaphore), "Thread-4");

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}

class Work implements Runnable {
    private final Semaphore semaphore;

    public Work(Semaphore semaphore) {
        this.semaphore = semaphore;
    }
    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + " is trying to acquire a permit...");
            semaphore.acquire();
            System.out.println(Thread.currentThread().getName() + " acquired a permit.");

            System.out.println(Thread.currentThread().getName() + " is working...");
            Thread.sleep(2000);

        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } finally {
            System.out.println(Thread.currentThread().getName() + " released the permit.");
            semaphore.release();
        }
    }
}

