package com.ivoyant.java.threads;

class C implements Runnable{
    public void run(){
        for (int i=0;i<5;i++)
        {
            System.out.println("Thread C is running...");
        }
    }

}
class D implements Runnable{
    public void run(){
        for (int i=0;i<5;i++)
        {
            System.out.println("Thread D is running...");
        }
    }

}
public class ThreadsRunnable {
    public static void main(String[] args) {
        Runnable obj1 = new C();
        Runnable obj2 = new D();

        Thread t1= new Thread(obj1);
        Thread t2=new Thread(obj2);
        t1.start();
        t2.start();

    }
}