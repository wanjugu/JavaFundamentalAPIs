package com.SpringFundamentalAPI.JavaFundamentalAPIs.Controllers.ReflectionAPI;

public class HelloReflection {


    public static void main(String[] args) {
        String hello = "Hello";
        Class helloClass = hello.getClass();
        System.out.println(helloClass);

        String world = "World";
        Class worldClass = world.getClass();
        System.out.println(worldClass);

        Class<?> helloClass1 = hello.getClass();
        System.out.println(helloClass1);

        Class<? extends  String> helloClass2 = "Hello".getClass();
        System.out.println("\n"+helloClass2);

        Class<? extends  Object> helloClass3 = "Hello".getClass();
        System.out.println("\n"+helloClass3);


    }
}
