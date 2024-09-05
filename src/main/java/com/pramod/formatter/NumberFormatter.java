package com.pramod.formatter;

import java.text.NumberFormat;

public class NumberFormatter {

    public static void main(String args[]){
        double d = 123.234d;
        NumberFormatter numberFormatter = new NumberFormatter();
        NumberFormat numberFormat = NumberFormat.getNumberInstance();
        System.out.println(numberFormat.format(d));
    }
}
