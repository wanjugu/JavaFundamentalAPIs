package com.SpringFundamentalAPI.JavaFundamentalAPIs.Controllers.DataStructures;

import java.util.LinkedList;
import java.util.ListIterator;

public class JavaLinkedList {

    public static void main(String[] args) {
        LinkedList<Person> personLinkedList = new LinkedList<>();
        personLinkedList.add(new Person("Will", 20));
        personLinkedList.add(new Person("Paul", 12));

        ListIterator<Person> personListIterator = personLinkedList.listIterator();
        while (personListIterator.hasNext()){
            System.out.println(personListIterator.next());
        }
        System.out.println("\n");

        //Loop backward
        while (personListIterator.hasPrevious()){
            System.out.println(personListIterator.previous());
        }

    }

    static  record Person(String name, int age){}
}
