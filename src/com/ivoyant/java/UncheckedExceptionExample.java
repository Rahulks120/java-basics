package com.ivoyant.java;
//Since unchecked exceptions are often due to bugs in the code, they typically don't need explicit handling. However, you can still catch them using try-catch blocks if you expect them and want to handle them gracefully.
public class UncheckedExceptionExample {
    public static void main(String[] args) {
        try {
            int[] arr = new int[5];
            arr[10] = 3;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught an ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
    }
}
