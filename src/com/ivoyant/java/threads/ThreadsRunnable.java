package com.ivoyant.java.threads;

class EmailSender implements Runnable{
    public void run(){
        for (int i=0;i<5;i++)
        {
            System.out.println("EmailSender thread is sending an email...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e.getMessage());
            }
        }
    }

}
class ReportGenerator implements Runnable{
    public void run(){
        for (int i=0;i<5;i++)
        {
            System.out.println("ReportGenerator thread is generating a report...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e.getMessage());
            }
        }
    }

}
public class ThreadsRunnable {
    public static void main(String[] args) {
        EmailSender emailSender= new EmailSender();
        ReportGenerator reportGenerator = new ReportGenerator();

        Thread t1= new Thread(emailSender );
        Thread t2=new Thread(reportGenerator);
        t1.start();
        t2.start();

    }
}