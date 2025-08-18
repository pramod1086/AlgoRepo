package com.pramod.algorithm.leetcode;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StringCompression_443 {

    public static void main(String args[]) {

        char [] ch  = {'a','b','b','b','b','b','b','b','b','b','b','b','b'};
        StringCompression_443  str = new StringCompression_443();
        System.out.println(str.compress1(ch));
    }


    public int compress1(char[] chars) {

        int write = 0, read = 0;

        while (read < chars.length) {
            char current = chars[read];
            int count = 0;

            while (read < chars.length && chars[read] == current) {
                read++;
                count++;
            }

            chars[write++] = current;

            if (count > 1) {
                for (char c : String.valueOf(count).toCharArray()) {
                    chars[write++] = c;
                }
            }
        }

        return write;


    }


    /// this is wrong

    public int compress(char[] chars) {
        //count the number of char in array

        int len = chars.length;
        if(len==0 || len ==1){
            return len;
        }


        Map<Character, Long> ms =  IntStream.range(0, chars.length)
                .mapToObj(i -> chars[i]).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));


        int writeIndex = 0;
        for(Map.Entry mk:ms.entrySet()){

            long value = (long) mk.getValue();
            chars[writeIndex++]= (char)mk.getKey();


            if (value > 1) {
                for (char c : String.valueOf(value).toCharArray()) {
                    chars[writeIndex++] = c;
                }
            }

        }


        return writeIndex;



    }
}
