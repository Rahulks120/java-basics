package com.ivoyant.java;

public class LabeledBreakStmt {
    public static void main(String[] args) {
        outerLoop:
        for (int i = 0; i < 5; i++) {
            innerLoop:
            for (int j = 0; j < 5; j++) {
                if (i == 2 && j == 2) {
                    break outerLoop;
                }
                System.out.println("i: " + i + ", j: " + j);
            }
        }
    }
}
