package com.ivoyant.java;

import java.io.*;

public class CsvFileRead {
    public static void main(String[] args) {
        String file = "C:\\Users\\RAHUL\\Downloads\\sales.csv";
        BufferedReader read =null;
        String line="";

        try {
            read = new BufferedReader(new FileReader(file));
            while((line =read.readLine())!=null){
                 String[] row = line.split(",");
                 for(String str:row)
                 {
                     System.out.printf("%-15s",str);
                 }
                System.out.println();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            try {
                read.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
