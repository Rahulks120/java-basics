package com.ivoyant.java.CallableAndFuture;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableAndFutureExample {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();

        SumTask sumTask = new SumTask();

        Future<Integer> future = executor.submit(sumTask);
        try {
            Integer result = future.get();
            System.out.println("Sum is: " + result);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            executor.shutdown();
        }
    }
}
