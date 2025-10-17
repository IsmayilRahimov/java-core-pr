package org.example.lambdaexpression;

import java.util.ArrayList;
import java.util.List;

public class SoutLambda {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        numbers.removeIf(n -> n == 1 || n == 3);
        System.out.println(numbers);

        for (Integer num : numbers) {
            System.out.println(num);

        }
    }
}
