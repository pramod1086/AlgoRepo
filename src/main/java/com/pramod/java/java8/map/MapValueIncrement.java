package com.pramod.java.java8.map;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MapValueIncrement {

    public static void main(String args[]) {
        Map<Integer, Integer> ms = new HashMap();
        ms.put(1, 2);
        ms.put(2, 6);
        ms.put(3, 7);
        ms.put(4, 8);
        ms.put(5, null);
        // ms.put(null,null);

        //  Update value of HashMap using computeIfPresent()if value contains null
        for (Map.Entry<Integer, Integer> entry : ms.entrySet()) {
            //   ms.put(entry.getKey(), entry.getValue()+1);
            ms.computeIfPresent(entry.getKey(), (key, oldValue) -> oldValue + 2);
            //   System.out.println(entry.getKey() + "/" + entry.getValue());
        }
        for (Map.Entry<Integer, Integer> entry : ms.entrySet()) {
            System.out.println(entry.getKey() + "/" + entry.getValue());
        }

        // update the value of First
        // Using the merge() method
        for (Map.Entry<Integer, Integer> entry : ms.entrySet()) {
            ms.merge(entry.getKey(), 4, (oldValue, newValue) -> oldValue + newValue);
            System.out.println("HashMap with updated value: " + ms);
        }


        for (Map.Entry<Integer, Integer> entry : ms.entrySet()) {
            System.out.println(entry.getKey() + "/" + entry.getValue());
        }

        for (Map.Entry<Integer, Integer> entry : ms.entrySet()) {
            ms.put(entry.getKey(), ms.getOrDefault(entry.getKey(), 0) + 1);

            System.out.println("HashMap with updated value: " + ms);
        }


        for (Map.Entry<Integer, Integer> entry : ms.entrySet()) {
            System.out.println(entry.getKey() + "/" + entry.getValue());
        }


        ms.entrySet().forEach(element -> {
            System.out.println("Foreach testing:" + element.getValue());
        });


        Map uopdatedmap = ms.entrySet().stream().collect(Collectors.toMap(entry->entry.getKey(),entry->entry.getValue()+1));


        uopdatedmap.entrySet().forEach(element->{
            System.out.println("value "+element.toString());
        });


        Map<Integer, String> mapTesting = new HashMap();
        mapTesting.put(1,"test1");

        mapTesting.put(2,"test2");

        mapTesting.put(1,"test3");

        mapTesting.entrySet().stream().forEach(element->System.out.println("tje vlaye of erach valuer is "+element.getValue()));



    }

}
