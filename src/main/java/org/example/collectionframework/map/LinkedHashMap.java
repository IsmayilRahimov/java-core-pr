package org.example.collectionframework.map;

import java.util.Map;
import java.util.TreeMap;

public class LinkedHashMap {
    public static void main(String[] args) {
        Map<String, String> map1 = new java.util.LinkedHashMap<>();
        Map<Integer, Integer> map2 = new TreeMap<>();

        map1.put("a", "b");
        map2.put(1, 2);
        System.out.println(map1);
        System.out.println(map2);
    }
}
