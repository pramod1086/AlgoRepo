package com.pramod.java.designpattern.builder;

import java.util.function.BiConsumer;

public class BuilderTest {


    public static void main(String args[]){
        User user = (User) GenericBuilder.of(User::new)
               // .with(User::setFirstName,"test")
                .with((user1,detail)->user1.setFirstName(detail),"test")
                .with(User::setLastName,"test")
                .get();
        System.out.println(user);

    }

}
