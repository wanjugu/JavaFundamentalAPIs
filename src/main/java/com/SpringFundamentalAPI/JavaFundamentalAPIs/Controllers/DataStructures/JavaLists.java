package com.SpringFundamentalAPI.JavaFundamentalAPIs.Controllers.DataStructures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JavaLists {
    /* Why List?
    * Unlike Arrays, 1. Allows Duplicates, 2. Not fixed in size, 3. Fast for data retrieval,
    * Implementations: ArrayLists, Stack, Vectors, Others
    * */
    public static void main(String[] args) {

        List<String> colors = new ArrayList<>();
        colors.add("Blue");
        colors.add("Purple");
        colors.add("Yellow");

        for (String color : colors){
            System.out.println(color);
        }

        colors.add("indigo");
        System.out.println("----------");
        colors.forEach(System.out::println);
        //size
        System.out.println("Size:: " +colors.size());

        //contains
        System.out.println("Contains::" + colors.contains("Yellow"));

        for(int i = 0; i < colors.size(); i ++){
            System.out.println(colors.get(i));
        }



        /**
         * Using List.of();
         * NB: List.of() is immuttable (not modifiable)
         * */
        List<String> colorsUnmodifiable = List.of("BLACK","WHITE","RED","GREEN");
        System.out.println("KENYA FLAG COLORS::");
        colorsUnmodifiable.forEach(System.out::println);
      //  colorsUnmodifiable.add("YELLOW"); //This will Raise Exception

    }
}
