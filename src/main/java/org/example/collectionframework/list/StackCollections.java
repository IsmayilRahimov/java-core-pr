package org.example.collectionframework.list;

import java.util.Stack;

public class StackCollections {

    public static void main(String[] args) {
        Stack<String> m1 = new Stack<>(); // Lifo last in first out
        m1.push("Anar");
        m1.push("Cavid");
        m1.push("Musa");
        System.out.println(m1.peek()); // en ustdeki elementi gosterir;
        m1.pop(); // silme
        System.out.println(m1.peek());
        System.out.println(m1.empty());
    }
}
