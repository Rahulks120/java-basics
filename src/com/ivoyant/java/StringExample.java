package com.ivoyant.java;

public class StringExample {
    public static void main(String[] args) {
        String s1= "java";
        String s2= "JAVA";
        String s3 = "java"+"JAVA";
        String s4 ="java"+"JAVA";
        String s5 = s1+s2;
        String s6 = s1+s2;
        String str= new String("Hello World");

        String str1 = s1.concat(str);
        System.out.println(str1.length());
        System.out.println(str1.substring(10,15));
        System.out.println(str1);
        System.out.println(s3==s4);
        System.out.println(s3.equals(s4));
        System.out.println(s5==s6);
        System.out.println(s5.equals(s6));
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.compareTo(s4));
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.charAt(2));
        System.out.println(s1.indexOf('v'));
        System.out.println(s1.isEmpty());
    }
}
