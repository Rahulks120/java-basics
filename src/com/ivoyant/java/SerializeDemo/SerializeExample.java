package com.ivoyant.java.SerializeDemo;

import com.ivoyant.java.FileOutputStreamExample;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeExample {
    public static void main(String[] args) {
        Person person = new Person("Rahul",22);

        try {
            FileOutputStream fos = new FileOutputStream("person.ser");
            ObjectOutputStream out = new ObjectOutputStream(fos);
            out.writeObject(person);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
