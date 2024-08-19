package com.ivoyant.java.SerializeDemo;

import java.io.Serializable;

public class Person implements Serializable {

    private  static final long serialVersionUID = 7581288912016876506L;

    private String name;
    private int age;

    private String gender="male";

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



}
