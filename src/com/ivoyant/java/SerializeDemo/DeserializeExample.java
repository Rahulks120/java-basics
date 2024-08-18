package com.ivoyant.java.SerializeDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeExample {
    public static void main(String[] args) {
        Person person =null;
        try {
            FileInputStream fis = new FileInputStream("person.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            person =(Person) ois.readObject();
            System.out.println(person.getAge());
            System.out.println(person.getName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
