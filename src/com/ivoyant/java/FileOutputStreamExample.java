package com.ivoyant.java;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample {
    public static void main(String[] args) {
        String filePath ="C:\\Users\\RAHUL\\Documents\\b.txt";

        FileOutputStream fos = null;

        try {
            fos = new FileOutputStream(filePath);
            byte[] data = {65, 66, 67, 68, 69};

            fos.write(data);
            System.out.println("Data written to file.");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        } finally {
            try {
                if (fos != null) {
                    fos.close();
                }
            } catch (IOException e) {
                System.out.println("Error closing stream: " + e.getMessage());
            }
        }
    }
}
