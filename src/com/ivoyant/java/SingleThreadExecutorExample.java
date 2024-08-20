package com.ivoyant.java;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadExecutorExample {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newSingleThreadExecutor();

        executorService.submit(new Task("Task 1"));
        executorService.submit(new Task("Task 2"));
        executorService.submit(new Task("Task 3"));

        executorService.shutdown();
    }
}
    class Task implements Runnable {
        private final String name;

        public Task(String name) {
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

