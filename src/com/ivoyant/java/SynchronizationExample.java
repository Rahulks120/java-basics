package com.ivoyant.java;

class BankAccount {
    private int balance = 0;

    public synchronized void deposit(int amount) {
        int newBalance = balance + amount;
        System.out.println(Thread.currentThread().getName() + " depositing " + amount);
        balance = newBalance;
        System.out.println(Thread.currentThread().getName() + " new balance is " + balance);
    }

    public int getBalance() {

        return balance;
    }
}

class DepositThread extends Thread {
    private BankAccount account;
    private int amount;

    public DepositThread(BankAccount account, int amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void run() {

        account.deposit(amount);
    }
}

public class SynchronizationExample {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        DepositThread t1 = new DepositThread(account, 100);
        DepositThread t2 = new DepositThread(account, 200);
        DepositThread t3 = new DepositThread(account, 300);

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final balance is: " + account.getBalance());
    }
}
