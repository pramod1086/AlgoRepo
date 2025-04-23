package com.pramod.algorithm.javacodingproblem.chapter1;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatedCharacter {

    private static final int ExtendedAsciiCode = 256;
    public static void main(String args[]){

        String str = "abcabchde";

        System.out.println(getFirstNonRepeatedCharacter(str));
        System.out.println(getFirstNonRepeatedCharacterUsingMap(str));
        System.out.println(getFirstNonRepeatedCharacterUsingMapUsingCodePoint(str));
        System.out.println(getFirstNonRepeatedCharacterUsingMapObj(str));

    }

    private static char getFirstNonRepeatedCharacter(String str) {

        int [] flags = new int[ExtendedAsciiCode];
        Arrays.fill(flags,-1);

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(flags[ch]==-1){
                flags[ch] = i;
            }else {
                flags[ch]=-2;
            }

        }

        int position  = Integer.MAX_VALUE;
        for(int i =0;i< flags.length;i++){
            if( flags[i] >=0){
                position = Math.min(position,flags[i]);
            }

        }

        return position == Integer.MAX_VALUE?Character.MIN_VALUE:str.charAt(position);

    }

    private static char getFirstNonRepeatedCharacterUsingMap(String str) {
        Map<Character,Integer> ms = new LinkedHashMap();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            ms.compute(ch,(key,value)->value==null?1:++value);
        }

        for(Map.Entry<Character,Integer> entry:ms.entrySet()){

            if(entry.getValue()==1)
                return entry.getKey();
        }
        return Character.MIN_VALUE;
    }
    private static String getFirstNonRepeatedCharacterUsingMapUsingCodePoint(String str) {

        LinkedHashMap<Integer, Long> ms  = str.codePoints().mapToObj(cp->cp).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));

//        for(Map.Entry<Integer,Long> entry:ms.entrySet()){
//
//            if(entry.getValue()==1)
//                return entry.getKey();
//        }
       Integer returnedValue =  ms.entrySet().stream().filter(element->element.getValue()==1L).findFirst().map(element->element.getKey()).orElse(0);
        return String.valueOf(Character.toChars(returnedValue));
    }
    private static String getFirstNonRepeatedCharacterUsingMapObj(String str) {

        LinkedHashMap<Character, Long> ms  = str.chars().mapToObj(cp->(char)cp).collect(Collectors.groupingBy(character->character,LinkedHashMap::new,Collectors.counting()));
        Character returnedValue =  ms.entrySet().stream().filter(element->element.getValue()==1L).findFirst().map(element->element.getKey()).orElse(Character.MIN_VALUE);
        return String.valueOf(Character.toChars(returnedValue));
    }
}


