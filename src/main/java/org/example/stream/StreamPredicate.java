package org.example.stream;

import java.util.List;

public class StreamPredicate {
    public static void main(String[] args) {
        List<Integer> num = List.of(109, 208, 307, 500);
        List<Integer> ededler = num.stream()
                .filter(n -> n % 2 == 0)
                .toList();
        System.out.println(ededler);
    }
}
