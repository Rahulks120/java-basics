package com.ivoyant.java;

 class UserContext {
    private static final ThreadLocal<String> userSession = new ThreadLocal<>();
    public static void setUser(String user) {
        userSession.set(user);
    }
    public static String getUser() {

        return userSession.get();
    }
    public static void clear()
    {
        userSession.remove();
    }
}
public class ThreadLocalExample {
    public void processRequest(String user) {
        UserContext.setUser(user);
        try {
            System.out.println("Processing request for user: " + UserContext.getUser());
        } finally {
            UserContext.clear();
        }
    }
    public static void main(String[] args) {
        ThreadLocalExample service = new ThreadLocalExample();

        Runnable task1 = () -> service.processRequest("User1");
        Runnable task2 = () -> service.processRequest("User2");

        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

