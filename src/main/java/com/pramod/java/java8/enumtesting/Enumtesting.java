package com.pramod.java.java8.enumtesting;

public enum Enumtesting {
    FIRST_VALUE("test"),
    SECOND_VALUE("test1"),
    THIRD_VALUE("test2");

    String value ;

    Enumtesting(String test) {
        this.value = test;
    }

    public String getValue(){
        return value;
    }
}
