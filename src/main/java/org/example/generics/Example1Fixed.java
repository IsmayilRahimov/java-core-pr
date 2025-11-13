package org.example.generics;

import java.util.ArrayList;

public class Example1Fixed {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Anar");
        String s = list.get(0);
        System.out.println(s);

    }
}
