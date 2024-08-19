package com.ivoyant.java.threads;

class A extends Thread{
    public void run()
    {
        for (int i=0;i<5;i++){
            System.out.println("Thread A is running...");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
class B extends Thread{
    public void run()
    {
        for (int i=0;i<5;i++){
            System.out.println("Thread B is running...");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
public class ThreadsExample {
    public static void main(String[] args) {
        A obj1= new A();
        B obj2 = new B();
        obj1.start();
        obj2.start();

    }
}