package com.ivoyant.java;

public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");

        sb.append(" World");
        System.out.println("After append: " + sb);

        sb.insert(5, ",");
        System.out.println("After insert: " + sb);

        sb.replace(6, 11, "Java");
        System.out.println("After replace: " + sb);

        sb.delete(5, 6);
        System.out.println("After delete: " + sb);

        sb.reverse();
        System.out.println("After reverse: " + sb);

        String finalString = sb.toString();
        System.out.println("Final String: " + finalString);

        int length =finalString.length();
        System.out.println("finalString length: "+length);

    }
}
