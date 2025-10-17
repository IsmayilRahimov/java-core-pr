package org.example.lambdaexpression.lambda;

import java.util.function.BiFunction;

public class BiFunctionLambda {

    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> eded = (a, b) -> a * b;
        System.out.println(eded.apply(10, 20));
        BiFunction<Integer, Integer, Integer> reqem = (c, b) -> c / b;
        System.out.println(reqem.apply(10,2));


    }
}
