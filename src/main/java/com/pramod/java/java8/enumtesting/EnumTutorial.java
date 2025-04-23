package com.pramod.java.java8.enumtesting;

public class EnumTutorial {
    public static void main(String[] args) {

        // Enumtesting enumtesting = new Enumtesting();
        Enumtesting enumtesting = Enumtesting.FIRST_VALUE;


        System.out.println(enumtesting);
      //  System.out.println(getEnumValue(enumtesting));
        System.out.println(enumtesting.getValue());
    }

//    private static boolean getEnumValue(Enumtesting enumtesting) {
//        switch (enumtesting) {
//            case FIRST_VALUE -> {
//                return true;
//            }
//            default -> {
//                return false;
//            }
//
//        }
//
//    }
}
