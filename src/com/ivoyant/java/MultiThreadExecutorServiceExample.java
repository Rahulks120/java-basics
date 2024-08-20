package com.ivoyant.java;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class MultiThreadExecutorServiceExample {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(3);

        for (int i = 1; i <= 5; i++) {
            Runnable task = new Task1("Task " + i);
            executorService.submit(task);
        }

        executorService.shutdown();
    }

}
     class Task1 implements Runnable {
        private final String name;

        public Task1(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            System.out.println(name + " is being executed by " + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            System.out.println(name + " is completed by " + Thread.currentThread().getName());
        }
    }


