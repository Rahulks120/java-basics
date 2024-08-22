package com.ivoyant.java;

public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");

        new Thread(() -> {
            sb.append(" World");
            System.out.println(sb);
        }).start();

        new Thread(() -> {
            sb.append(" Java");
            System.out.println(sb);
        }).start();
    }
}
