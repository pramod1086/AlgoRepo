package com.pramod.java.designpattern.builder;

public class BuilderTest {
    public static void main(String args[]){
        User user = (User) GenericBuilder.of(User::new)
                .with(User::setFirstName,"test")
                .get();
        System.out.println(user);

    }

}
