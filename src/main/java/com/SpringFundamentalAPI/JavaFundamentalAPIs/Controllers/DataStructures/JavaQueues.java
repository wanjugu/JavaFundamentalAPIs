package com.SpringFundamentalAPI.JavaFundamentalAPIs.Controllers.DataStructures;


import java.util.LinkedList;
import java.util.Queue;

/**
 * A queue is a collection designed for holding elements prior to processing
 * Queue use FIFO Algorithm
 * */
public class JavaQueues {
    public static void main(String[] args) {
        Queues();

    }

    public static void Queues() {

        Queue<Person> queue = new LinkedList<>();
        queue.add(new Person("William", 17));
        queue.add(new Person("Allan", 22));
        queue.add(new Person("Mercy", 26));

        System.out.println("People in Queue:::" + queue);

        System.out.println("First Person in Queue:: " + queue.peek() );

        System.out.println("Queue Size:: " + queue.size());

        System.out.println("Attend to the First Person::" + queue.poll());

        System.out.println("Current First Person in Queue:: " + queue.peek() );

        System.out.println("Size after pool::" +queue.size());

        System.out.println("Queue after pool::" + queue);
    }

    static record Person(String name, int age){}
}
