package com.pramod.algorithm.bitwise;

public class DecimalToBinary {
    public static void main(String[] args)
    {
        DecimalToBinary decimalToBinary = new DecimalToBinary();
         int binary = decimalToBinary.convertDecimalToBinary(9);
        // Function call
        System.out.println(binary);
    }

    public Integer convertDecimalToBinary(Integer decimalNumber) {

        if (decimalNumber == 0) {
            return decimalNumber;
        }

        StringBuilder binaryNumber = new StringBuilder();
        Integer quotient = decimalNumber;

        while (quotient > 0) {
            int remainder = quotient % 2;
            binaryNumber.append(remainder);
            quotient /= 2;
        }

        binaryNumber = binaryNumber.reverse();
        return Integer.valueOf(binaryNumber.toString());
    }

}
