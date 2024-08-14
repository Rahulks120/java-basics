package com.ivoyant.java;

public class TernaryOperatorDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        int max = (a > b) ? a : b;

        System.out.println("The maximum value is: " + max);

        String result = (a == b) ? "a is equal to b" : "a is not equal to b";
        System.out.println(result);
    }
}
