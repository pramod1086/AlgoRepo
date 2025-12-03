package com.pramod.java.java8.functionalInterface.biconssumer;

import com.pramod.java.designpattern.builder.User;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;

public class BiconsumerTesting {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Apple", 3);
        map.put("Banana", 2);
        map.put("Orange", 5);

        // Print each key-value pair
        BiConsumer<String, Integer> printEntry = (key, value) -> System.out.println(key + " : " + value);
        map.forEach(printEntry);

        BinaryOperator<Integer> func = (x1, x2) -> x1.compareTo(x1);


        BinaryOperator
                <java.lang.Integer> c = BinaryOperator.maxBy(Integer::compare);
        System.out.println(  c.apply(1,2)); // 5

        Integer result2 = func.apply(2, 3);

        BiConsumer<User,String> bi = (user, detail)->{
            user.setFirstName(detail);

        };

        BiConsumer<User,String> bi1 = User::setLastName;

        System.out.println(result2); // 5
        // Output:
        // Apple : 3
        // Banana : 2
        // Orange : 5

        User usr = new User();

        bi.accept(usr,"test");
        System.out.println(usr); // 5

        bi1.accept(usr,"delat");
        System.out.println(usr); // 5





    }
}
