package com.ivoyant.java;

public class ArrayExample {
    public static void main(String[] args) {
        // 1. Creating an array
        int[] numbers = new int[5];

        // 2. Initializing an array
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;

        // Alternative way to create and initialize an array
        int[] moreNumbers = {1, 2, 3, 4, 5};

        // 3. Accessing and modifying array elements
        System.out.println("First element: " + numbers[0]); // Output: 10
        numbers[0] = 100; // Modify the first element
        System.out.println("Modified first element: " + numbers[0]); // Output: 100

        // 4. Iterating through an array
        for (int i = 0; i < numbers.length; i++) {
            System.out.println( numbers[i]);
        }

        // Enhanced for loop (foreach) to iterate through 'moreNumbers'
        for (int number : moreNumbers) {
            System.out.println(number);
        }
    }
}
