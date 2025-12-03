package com.pramod.java.java8.enumtesting;

public class EnumTutorial {
    public static void main(String[] args) {

        // Enumtesting enumtesting = new Enumtesting();
        Enumtesting enumtesting = Enumtesting.FIRST_VALUE;


        System.out.println(enumtesting);
      //  System.out.println(getEnumValue(enumtesting));
        System.out.println(enumtesting.getValue());

        for(Enumtesting es:Enumtesting.values()){
            System.out.println(es.getValue());


        }
        Operations ops = Operations.PLUS;
        System.out.println(ops.apply(1,5));
        System.out.println(Operations.MINUS.apply(1,5));
        System.out.println(Operations.DEVIDE.apply(1,5));



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
