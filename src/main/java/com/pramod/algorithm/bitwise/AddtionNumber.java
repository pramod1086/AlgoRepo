package com.pramod.algorithm.bitwise;

import java.util.ArrayList;
import java.util.Arrays;

public class AddtionNumber {

    public static void main(String[] args) throws
            java.lang.Exception {

        int x = 30;
        int y = x | 1;
        System.out.println(y);
        ArrayList<Integer> ls = plusOne(new ArrayList<>((Arrays.asList(1,2,3))));
        System.out.println(ls);
    }

    public static ArrayList<Integer> plusOne(ArrayList<Integer> A) {


        int lenght = A.size() - 1;
        System.out.println(lenght);

        int value = A.get(lenght);
        int updatedVAlue = value ^1;
        System.out.println(updatedVAlue);
        A.set(lenght, updatedVAlue);
        return A;

    }
}

