package org.example.generics;

import jdk.jshell.execution.Util;

public class Utill {
    public static <T> void print(T data) {
        System.out.println(data);
    }

    public static <T> boolean isEqual(T a, T b) {
        return a.equals(b);
    }

    public static void main(String[] args) {

        Utill.isEqual(10, 10);
        Utill.print(42);
        Utill.print("Salam");
        System.out.println(Utill.isEqual("A", "B"));
    }
}
