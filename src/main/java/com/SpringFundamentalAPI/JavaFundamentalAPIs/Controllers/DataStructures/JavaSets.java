package com.SpringFundamentalAPI.JavaFundamentalAPIs.Controllers.DataStructures;

import java.util.HashSet;
import java.util.Set;

public class JavaSets {

    /**
     * SET is collection that contains no duplicates elements
     * */

    public static void main(String[] args) {

        Set<Ball> balls = new HashSet<>();
        balls.add(new Ball("Blue"));
        balls.add(new Ball("`yellow`"));
        balls.add(new Ball("`Black`"));
        balls.add(new Ball("`Black`"));

        balls.forEach(System.out::println);

        System.out.println(balls.size());

    }

    record Ball(String color){}
}
