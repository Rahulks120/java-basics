package com.ivoyant.java;

import java.nio.file.*;
import java.io.IOException;
import java.util.List;

public class FileReadExample {
    public static void main(String[] args) {
        Path path = Paths.get("C:\\Users\\RAHUL\\Documents\\b.txt");
        try {
            List<String> lines = Files.readAllLines(path);
            for (String line : lines) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

