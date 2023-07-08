package com.SpringFundamentalAPI.JavaFundamentalAPIs.Controllers.DataStructures;

import java.util.HashMap;
import java.util.Map;

public class JavaMaps {
    public static void main(String[] args) {
        Map<Integer,Person> map = new HashMap<>();

        map.put(1, new Person("Alice"));
        map.put(2, new Person("Adam"));
        map.put(3, new Person("Amal"));

        System.out.println(map.size());
        System.out.println(map.get(1));
        System.out.println(map.containsKey(4)); //false
        System.out.println(map.keySet());
        System.out.println(map.entrySet() + "\n");

        //loop
        map.entrySet().forEach(System.out::println);

        //Loop with lambda
        System.out.println("Lambda Loop:: \n");
        map.entrySet().forEach(x-> System.out.println(
                x.getKey() + " " + x.getValue()
        ));

        //Alternate loop
        System.out.println("\n Alternate Loop:: \n");
        map.forEach((key,person)->{
            System.out.println(key + "-" + person.name());
        });
    }



    record Person(String name){};

}
