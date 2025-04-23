package com.pramod.algorithm.javacodingproblem.chapter1;

import java.util.stream.IntStream;

public class PermuteAllString {

    public static void main(String []args){

        String str = "ABC";
        permuteAndPrintString(str,"");
        System.out.println("");
        permuteAndPrintStringUsingJava8(str,"");
    }

    private static void permuteAndPrintString(String str, String prefix) {

        int length = str.length();

        if(length ==0){
            System.out.println(prefix);
        }

        for(int i =0;i<length;i++){


         //   permuteAndPrintString(str.substring(i+1)+str.substring(0,i),prefix+str.charAt(i));

            // String = ABC
            //i= 0 and len = 3    i=1,len = 3
            //  str = "",BC ,prefix = A

            //i= 0 and len = 2
            //  str = "",C ,prefix = AB

            //i= 0 and len = 1
            //  str = "", ,prefix = ABC



            permuteAndPrintString(str.substring(0,i)+str.substring(i+1),prefix+str.charAt(i));
        }

    }
    private static void permuteAndPrintStringUsingJava8(String str, String prefix) {

        int length = str.length();

        if(length ==0){
            System.out.println(prefix);
        }

        IntStream.range(0,length).parallel().forEach(
              element->  permuteAndPrintStringUsingJava8(str.substring(0,element)+str.substring(element+1),prefix+str.charAt(element)
        ));


    }
}
