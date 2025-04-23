package com.pramod.algorithm.permutation;

import java.util.HashMap;

public class PermutationOfString {

    public static void main(String[] args) {


        String s1 = "ab";
        String s2="eidbaooo";
        System.out.println(new PermutationOfString().checkInclusion(s1,s2));
    }
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length())
            return false;
        HashMap<Character, Integer> s1map = new HashMap<>();
        HashMap<Character, Integer> s2map = new HashMap<>();

        for (int i = 0; i < s1.length(); i++)
            s1map.put(s1.charAt(i), s1map.getOrDefault(s1.charAt(i), 0) + 1);

        for (int j = 0; j < s2.length(); j++)
            s2map.merge(s2.charAt(j), 1, Integer::sum);
//            s2map.put(s2.charAt(j),s2map.getOrDefault(s2map.get(j),0)+1);
        if (matches(s1map, s2map))
            return true;
        return false;


    }
    public boolean matches(HashMap<Character, Integer> s1map, HashMap<Character, Integer> s2map) {
        for (char key : s1map.keySet()) {

            if(s1map.get(key).equals(s2map.get(key)))
            return true;
        }
        return false;
    }

}
