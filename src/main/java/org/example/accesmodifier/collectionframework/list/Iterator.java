package org.example.accesmodifier.collectionframework.list;

import java.util.ArrayList;
import java.util.List;

public class Iterator {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Ismayil");
        list.add("Anar");
        list.add("Musa");


        for (String name : list) {
            System.out.println(name);
        }
        System.out.println(list);
    }
}
