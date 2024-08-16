package com.ivoyant.java;

class student {
    String name;
    int age;
    String address;

    // Constructor 1: No parameters (default constructor)
    student() {
        name = "Unknown";
        age = 0;
        address = "Not provided";
    }

    // Constructor 2: One parameter (name)
    student(String n) {
        name = n;
        age = 0;
        address = "Not provided";
    }

    // Constructor 3: Two parameters (name and age)
    student(String n, int a) {
        name = n;
        age = a;
        address = "Not provided";
    }

    // Constructor 4: Three parameters (name, age, and address)
    student(String n, int a, String addr) {
        name = n;
        age = a;
        address = addr;
    }

    // Method to display the person's details
    void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age + ", Address: " + address);
    }
}

public class ConstructorsOverloadingExample {
    public static void main(String[] args) {
        student person1 = new student();
        student person2 = new student("Alice");
        student person3 = new student("Bob", 30);
        student person4 = new student("Charlie", 25, "123 Main St");

        person1.displayInfo();
        person2.displayInfo();
        person3.displayInfo();
        person4.displayInfo();
    }
}

