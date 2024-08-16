package com.ivoyant.java;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // 1. Creating an ArrayList
        ArrayList<String> list = new ArrayList<>();

        // 2. Adding elements
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        // Display the ArrayList after adding elements
        System.out.println(list);

        // 3. Accessing elements
        System.out.println(list.get(1));

        // 4. Removing elements
        list.remove(1);
        list.remove("Cherry");

        // Display the ArrayList after removing elements
        System.out.println(list);

        // 5. Iterating through elements using a for loop
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Element at index " + i + ": " + list.get(i));
        }

        // 6. Iterating through elements using an enhanced for loop
        for (String fruit : list) {
            System.out.println(fruit);
        }

        // 7. Other useful methods
        System.out.println("Size of the ArrayList: " + list.size());

        System.out.println("Is the ArrayList empty? " + list.isEmpty());

        // Clear all elements
        // list.clear();
        // System.out.println("ArrayList after clearing: " + list);
    }
}
