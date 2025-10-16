package org.example.accesmodifier.collectionframework.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListProject {
    public static void main(String[] args) {
        List<Integer> array1 = new ArrayList<>();

        array1.add(100);
        array1.add(200);
        array1.add(300);
        array1.add(400);
        array1.add(500);
        array1.remove(1); // 1 ci indeksdeki ededi silir:

        System.out.println(array1);


    }
}
