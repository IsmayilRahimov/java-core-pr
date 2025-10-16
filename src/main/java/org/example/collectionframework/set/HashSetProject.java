package org.example.collectionframework.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetProject {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        set1.add("Aygun");
        set1.add("Aytac");
        set1.add("Amil");

        System.out.println(set1);
        System.out.println(set1.isEmpty());
        System.out.println(set1.contains("Aygun"));
        System.out.println(set1.iterator());

    }
}
