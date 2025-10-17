package org.example.lambdaexpression.lambda;

import java.util.function.Predicate;

public class PredicateLambda {
    public static void main(String[] args) {
        Predicate<Integer> num = n -> n % 2 == 0;
        System.out.println(num.test(10));
        System.out.println(num.test(5));
    }
}
