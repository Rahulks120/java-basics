package com.ivoyant.java;

import java.util.*;

class Person {
    private String name;
    private int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName()
    {
        return name;
    }
    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}
public class ComparatorExample {
    public static void main(String[] args) {
        // Create a list of Person objects
        List<Person> people = Arrays.asList(
                new Person("Alice", 30),
                new Person("Bob", 25),
                new Person("Charlie", 35)
        );

        // Using an anonymous inner class to create a Comparator
        Comparator<Person> ageComparator = new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return Integer.compare(p1.getAge(), p2.getAge());
            }
        };

        // Sort using the ageComparator
        Collections.sort(people, ageComparator);
//        System.out.println("Sorted by age: " + people);

        for (Person ppl:people) {
            System.out.println(ppl);
        }
    }
}


