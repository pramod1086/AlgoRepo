package com.pramod.java.java8.enumtesting;

public enum Operations {
  PLUS,MINUS,TIMES,DEVIDE;

    String value ;
    String second ;
    int third ;

//
//    Operations(String test, String secondValue, int third) {
//        this.value = test;
//        this.second = secondValue;
//        this.third = third;
//    }

    public String getValue(){
        return value+" " +second+" "+third;
    }

    public double apply(double x,double y){
      switch (this){
          case PLUS: return  x+y;
          case MINUS:return  x-y;
          case DEVIDE:return  x%y;

      }
//        throw  new AssertionError("unknown Ops");
        return 0;
    }

}
