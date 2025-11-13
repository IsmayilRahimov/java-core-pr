package org.example.generics;

import java.util.ArrayList;

public class Example1 {

    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList<>();
        arrayList.add("Java");
        arrayList.add(100);

        String s = (String) arrayList.get(0);
        System.out.println(s); // class cast exceptions
    }
}
