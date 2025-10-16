package org.example.accesmodifier.collectionframework.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueuepr {
    public static void main(String[] args) {
        PriorityQueue<String> q1 = new PriorityQueue<>();

        q1.add("Anar");
        q1.add("Akif");
        q1.add("Musab");
        System.out.println(q1);

        PriorityQueue<Integer> p1 = new PriorityQueue<>();
        p1.add(5);
        p1.add(1);
        p1.add(0);
        p1.add(10);
        System.out.println(p1);
    }
}
