package org.example.lambdaexpression.lambda;

import java.util.function.Function;

public class FunctionalLambda {

    public static void main(String[] args) {
        Function<Integer, String> eded = e -> (e % 2 == 0) ? "Cut" : "Tek";
        System.out.println(eded.apply(6));
    }
}
