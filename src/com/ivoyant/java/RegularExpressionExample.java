package com.ivoyant.java;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegularExpressionExample {
    public static void main(String[] args) {
        String str = "hello123";
        boolean result = Pattern.matches("\\w+\\d+",str);
        System.out.println(result);
        String s1= "hello 1234";
        String result1 = s1.replaceAll("\\s", "-");
        System.out.println(result1);
        String s2 = "one two one three";
        String result2= s2.replaceFirst("one", "1");
        System.out.println(result2);

//-------------------------------------------------
        String s3 = "apple,orange,banana";
        String[] fruits = s3.split(",");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
//-------------------------------------------------
        String text = "Hello 2 World! 3";
        String regex = "\\d+";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(text);

        while(matcher.find()) {
            System.out.println("Found match: " + matcher.group());
        }

//--------------------------------------------------------
        String emailRegex = "^[\\w.-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,7}$";
        Pattern ptrn = Pattern.compile(emailRegex);
        Matcher mch = ptrn.matcher("rahul@gmail.com");
        if (mch.matches()) {
            System.out.println("Valid email address");
        } else {
            System.out.println("Invalid email address");
        }

    }
}
