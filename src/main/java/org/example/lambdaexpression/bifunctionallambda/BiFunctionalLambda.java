package org.example.lambdaexpression.bifunctionallambda;

import java.util.function.BiFunction;

public class BiFunctionalLambda {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> num = (a, b) -> a * b;
        num.apply(10, 20);
    }
}
