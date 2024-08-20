package com.ivoyant.java;

class Sample extends Thread{
    @Override
    synchronized public void run() {
        try{
            System.out.println(Thread.currentThread().getName()+ " login " );
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName()+ " work ");
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName()+" logout ");
        }
        catch (Exception e)
        {
            System.out.println("problem");
        }
    }
}
public class Synchronize1 {
    public static void main(String[] args) {
        Sample s= new Sample();

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
