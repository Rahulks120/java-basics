package com.ivoyant.java;

class Car {
    // Attributes (properties)
    String color;
    String model;
    int year;

    Car(String c, String m, int y) {
        color = c;
        model = m;
        year = y;
    }
    void startEngine() {
        System.out.println("Engine started!");
    }
    void displayInfo() {
        System.out.println("Car Model: " + model + ", Year: " + year + ", Color: " + color);
    }
}
public class ClassObjectExample {
    public static void main(String[] args) {

        Car myCar = new Car("Red", "Toyota", 2020);
        myCar.startEngine();
        myCar.displayInfo();
    }
}

