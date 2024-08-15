package com.ivoyant.java;

public class LoopControlExample {

    public static void main(String[] args) {
       
        for (int i = 0; i <= 10; i++) {

            
            if (i == 5) {
                continue;  
            }

   
            System.out.println("i = " + i);

         
            if (i == 8) {
                break;  
            }
        }

        System.out.println("Loop exited.");
    }
}
