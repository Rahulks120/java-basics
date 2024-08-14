package com.ivoyant.java;

import java.util.Scanner;

public class IfStmt {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int val =sc.nextInt();

        if(val >0)
        {
            System.out.println("Positive integer");
        }
        else {
            System.out.println("Negative Integer");
        }

    }
}
