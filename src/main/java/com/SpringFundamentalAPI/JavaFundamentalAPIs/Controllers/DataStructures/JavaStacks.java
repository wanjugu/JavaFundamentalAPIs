package com.SpringFundamentalAPI.JavaFundamentalAPIs.Controllers.DataStructures;

import java.util.Stack;

public class JavaStacks {
    /***
     * Stack extends class Vectors; With five operations
     * push(), pop(), peek(), stack(), top()
     */

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        //Show top item : NB Stack use LIFO
        System.out.println("Top Element::" +stack.peek()); //3

        //Remove top Element
        stack.pop();
        System.out.println("Top Element after POP::" +stack.peek()); //2

        //add Element on top
        stack.push(6);
        System.out.println("New Top Element:: " + stack.peek()); //6

        System.out.println("New Stack::" + stack);

    }


}
