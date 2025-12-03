package com.pramod.java.java8.enumtesting;

public enum Enumtesting {
    FIRST_VALUE("test","firstValueTest",1),
    SECOND_VALUE("test1","SecondValueTest",2),
    THIRD_VALUE("test2","thirdValueTest",3);

    String value ;
    String second ;
    int third ;


    Enumtesting(String test,String secondValue,int third) {
        this.value = test;
        this.second = secondValue;
        this.third = third;
    }

    public String getValue(){
        return value+" " +second+" "+third;
    }
}
