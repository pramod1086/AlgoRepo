package com.pramod.java.java8.test;

public class ExceptionTesting {
    public static void main(String[] args) {
        int input = getTryCatch(10);
        System.out.println(input);
    }

    private static int getTryCatch(int i) {

        try {
            return 1;

        }catch (Exception exception){
            return 0;

        }finally {

            return 5;

        }
        

    }
}
