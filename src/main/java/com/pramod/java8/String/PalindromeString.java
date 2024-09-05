package com.pramod.java8.String;

public class PalindromeString {
    public static void main(String[] args) {
        String str = "abaa";
    }
    public boolean isPalindromePreJava8(String str) {
        StringBuilder sbr = new StringBuilder(str);
        String backward = sbr.reverse().toString().toLowerCase();
        return str.equals(backward);
    }
    public boolean isPalindromeJava8(String s) {
        String forward = s.toLowerCase().codePoints()
                .filter(Character::isLetterOrDigit) .collect(StringBuilder::new,
                        StringBuilder::appendCodePoint,
                        StringBuilder::append)
                .toString();
        String backward = new StringBuilder(forward).reverse().toString();
        return forward.equals(backward);
    }
}
