package com.ivoyant.java;
public class LogicalOperatorsDemo {
    public static void main(String[] args) {
        boolean x = true;
        boolean y = false;

        System.out.println("x && y: " + (x && y));  // false

        System.out.println("x || y: " + (x || y));  // true

        System.out.println("!x: " + (!x));          // false
        System.out.println("!y: " + (!y));          // true

        boolean result = (x && !y) || (y || !x);
        System.out.println("Result of (x && !y) || (y || !x): " + result);  // true
    }
}

