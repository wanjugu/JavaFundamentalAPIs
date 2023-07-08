package com.SpringFundamentalAPI.JavaFundamentalAPIs.Controllers.DataStructures;

import java.util.Arrays;

public class JavaArraysIntro {
    public static void main(String[] args) {

        String[] colors = new String[5];//empty array with 5 elements
        colors[0] = "Purple";
        colors[1] = "Blue";

        System.out.println(Arrays.toString(colors));
        System.out.println(colors[0]);

        //Use this when you have predefined array size
        int[] numbers = new int[2];
        numbers[0] = 100;
        numbers[1] = 200;

        //otherwise use
        int[] numbers1 = {100,200};

        /*`
        *Looping through array
        */
        System.out.println("-----------------------");
        for(int i  = 0; i < colors.length; i++){
            if( colors[i] != null ) {
                System.out.println(colors[i]);
            }
        }

        System.out.println("******************");
        //Alternative wayy to loop
        for(String c : colors){
            if(c != null ) {
                System.out.println(c);
            }
        }

        //Alternative
        System.out.println("******************");
        Arrays.stream(colors).forEach(System.out::println);

    }
}
