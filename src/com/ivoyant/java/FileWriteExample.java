package com.ivoyant.java;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteExample {
    public static void main(String[] args) {
        String filePath ="C:\\Users\\RAHUL\\Documents\\aa.txt";
        BufferedWriter writer = null;

        try {
            writer = new BufferedWriter(new FileWriter(filePath));
            writer.write("Hello, world!");
            writer.newLine();
            writer.write("This is a second line.");
            writer.newLine();
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        } finally {
            try {
                if (writer != null) {
                    writer.close();  // Close the writer
                }
            } catch (IOException e) {
                System.out.println("Error closing writer: " + e.getMessage());
            }
        }
    }
}
