package com.ivoyant.java;

class Account {
    private int balance = 0;

    public synchronized void deposit(int amount) {
        balance += amount;
    }

    public synchronized void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
        }
    }

    public synchronized int getBalance() {
        return balance;
    }
}

public class DeadLockExample {
    public static void main(String[] args) {
        Account account = new Account();

        Runnable depositTask = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    account.deposit(1);
                }
            }
        };

        Runnable withdrawTask = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    account.withdraw(1);
                }
            }
        };

        Thread t1 = new Thread(depositTask);
        Thread t2 = new Thread(withdrawTask);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final balance: " + account.getBalance());
    }
}
