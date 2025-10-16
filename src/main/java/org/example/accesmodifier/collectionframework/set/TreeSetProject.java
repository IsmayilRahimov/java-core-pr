package org.example.accesmodifier.collectionframework.set;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetProject {

    public static void main(String[] args) {
        Set<Integer> t1 = new TreeSet<>();

        t1.add(1);
        t1.add(5);
        t1.add(3);
        System.out.println(t1);
        t1.remove(1);
        System.out.println(t1);
    }
}
