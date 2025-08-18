package com.pramod.algorithm.leetcode;

import java.util.*;


public class  Compression_443 {

    public static void main(String args[])
    {

        Compression_443 cs = new Compression_443();
        char [] input  = {'a','b','b','b','b','b','b','b','b','b','b','b','b'};


        System.out.println(cs.compress(input));
    }

        public int compress(char[] chars) {

            int write = 0; // Position to write the compressed result
            int read = 0;  // Position to read the input array

            while (read < chars.length) {
                char currentChar = chars[read];
                int count = 0;

                while (read < chars.length && chars[read] == currentChar){
                    read++;
                    count++;
                }

                chars[write++] = currentChar;
                if (count > 1) {
                    char[] ch = String.valueOf(count).toCharArray();

                    for(char c : ch){
                        chars[write++] = c;
                    }

                }


            }




            return write;

    }
    
}
