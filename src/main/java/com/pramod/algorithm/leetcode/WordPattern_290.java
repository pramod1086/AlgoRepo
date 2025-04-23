package com.pramod.algorithm.leetcode;

import java.util.*;
import java.util.stream.IntStream;

public class WordPattern_290 {
    public static boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (words.length != pattern.length()) return false;

        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < words.length; i++) {
            String keyChar = "char_" + pattern.charAt(i);
            String keyWord = "word_" + words[i];

            Integer prevChar = map.put(keyChar, i);
            Integer prevWord = map.put(keyWord, i);
            if (!Objects.equals(prevChar, prevWord)) return false;

//            if (prevChar != null && !prevChar.equals(prevWord)) return false;
//            if (prevChar == null && prevWord != null) return false;
//            if (prevChar != null && prevWord == null) return false;
        }

        return true;
    }

    //this one is better
    public boolean wordPatternss(String pattern, String s) {
        String[] words = s.split(" ");
        if (pattern.length() != words.length) {
            return false;
        }

        HashMap<Character, String> charToWord = new HashMap<>();
        HashMap<String, Character> wordToChar = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String word = words[i];

            if (charToWord.containsKey(c)) {
                if (!charToWord.get(c).equals(word)) {
                    return false;
                }
            } else {
                if (wordToChar.containsKey(word)) {
                    return false;
                }
                charToWord.put(c, word);
                wordToChar.put(word, c);
            }
        }

        return true;
    }

    /// this one is best
    public boolean wordPatterna(String pattern, String s) {
        int j=0, i, m=pattern.length(), n=s.length(), c;
        Map<Character, String> mp = new HashMap<Character, String>();
        for(i=0; i<n && j<m; i++){
            c=0;
            while((i+c)<n && s.charAt(i+c) != ' ')
                c++;
            //System.out.print(s.substring(i, i+c));
            String sub = s.substring(i, i+c);
            char pt = pattern.charAt(j);
            if(mp.containsKey(pt)){
                if(!mp.get(pt).equals(sub))
                    return false;
            } else if(mp.containsValue(sub))
                return false;
            else
                mp.put(pt, sub);

            i += c;
            j++;
        }
        // System.out.println(i);
        // System.out.println(j);
        return j==m && i-1==n;
    }

    public static boolean wordPatterns(String pattern, String s) {
        String[] words = s.split(" ");
        if (words.length != pattern.length()) return false;

        Map<Character, String> charToWord = new HashMap<>();
        Set<String> usedWords = new HashSet<>();

        return IntStream.range(0, pattern.length()).allMatch(i -> {
            char c = pattern.charAt(i);
            String word = words[i];
            if (charToWord.containsKey(c)) {
                return charToWord.get(c).equals(word);
            } else {
                if (usedWords.contains(word)) return false;
                charToWord.put(c, word);
                usedWords.add(word);
                return true;
            }
        });
    }
    public static void main(String[] args) {
     //   System.out.println(wordPattern("abba", "dog cat cat dog")); // true
      //  System.out.println(wordPattern("abba", "dog cat cat fish")); // false
     //   System.out.println(wordPattern("aaaa", "dog cat cat dog")); // false
     //   System.out.println(wordPattern("abba", "dog dog dog dog")); // false
        System.out.println(wordPattern("a", "a")); // false
    }
}
