package org.example.stream;

import java.util.ArrayList;
import java.util.List;

public class ForEachConsumer {
    public static void main(String[] args) {
        List<String> meyveler = new ArrayList<>();
        meyveler.add("banan");
        meyveler.add("alma");
        meyveler.add("gilas");

        for (String fruit : meyveler) {
            System.out.println(fruit);
        }

        meyveler.forEach(n -> System.out.println(" Meyve" + n));
        meyveler.forEach(a -> System.out.println(a + " Fruits"));
    }
}
