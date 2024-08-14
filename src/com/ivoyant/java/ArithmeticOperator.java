package com.ivoyant.java;

public class ArithmeticOperator {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;


        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        int quotient = num1 / num2;
        int remainder = num1 % num2;


        System.out.println("Arithmetic Operations:");
        System.out.println("Sum: " + num1 + " + " + num2 + " = " + sum);
        System.out.println("Difference: " + num1 + " - " + num2 + " = " + difference);
        System.out.println("Product: " + num1 + " * " + num2 + " = " + product);
        System.out.println("Quotient: " + num1 + " / " + num2 + " = " + quotient);
        System.out.println("Remainder: " + num1 + " % " + num2 + " = " + remainder);
    }
}
