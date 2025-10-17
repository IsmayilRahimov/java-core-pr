package org.example.stream;

import java.util.List;

public class PredicateStream {
    public static void main(String[] args) {

        List<Integer> num = List.of(11, 202, 303, 404); // predicate
        List<Integer> eded = num.stream()
                .filter(n -> n % 2 == 0)
                .toList();
        System.out.println(eded);
    }
}
