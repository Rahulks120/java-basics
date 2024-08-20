package com.ivoyant.java;

class Office extends Thread{
    @Override
     public void run() {
        try{
            System.out.println(Thread.currentThread().getName()+ " login " );
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName()+ " work ");
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName()+" logout ");
            Thread.sleep(2000);
            synchronized (this) {
                System.out.println(Thread.currentThread().getName() + " stmt1 ");
                Thread.sleep(2000);
                System.out.println(Thread.currentThread().getName() + " stmt2 ");
                Thread.sleep(2000);
                System.out.println(Thread.currentThread().getName() + " stmt3 ");
                Thread.sleep(2000);
                System.out.println(Thread.currentThread().getName() + " stmt4 ");
                Thread.sleep(2000);
                System.out.println(Thread.currentThread().getName() + " stmt5 ");
            }
        }
        catch (Exception e)
        {
            System.out.println("problem");
        }
    }
}
public class SynchronizeBlock {
    public static void main(String[] args) {
        Office s= new Office();

        Thread t1= new Thread(s);
        Thread t2 = new Thread(s);
        Thread t3 = new Thread(s);

        t1.setName("Employee1");
        t2.setName("Employee2");
        t3.setName("Employee3");

        t1.start();
        t2.start();
        t3.start();

    }
}
