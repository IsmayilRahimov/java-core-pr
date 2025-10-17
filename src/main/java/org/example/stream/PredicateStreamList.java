package org.example.stream;

import java.util.List;

public class PredicateStreamList {
    public static void main(String[] args) {
        List<Integer> num = List.of(10, 20, 400, 99);

        List<Integer> ededler = num.stream()
                .filter(n -> n % 2 == 0) // predicate
                .toList();
        System.out.println(ededler);
    }
}
