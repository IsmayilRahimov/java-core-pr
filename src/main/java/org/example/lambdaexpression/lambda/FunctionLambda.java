package org.example.lambdaexpression.lambda;

import java.util.function.Function;

public class FunctionLambda {
    public static void main(String[] args) {
        Function<Integer, String> num = n -> (n % 2 == 0) ? "Cut " : "Tek";
        System.out.println(num.apply(5));

        Function<Integer, String> eded = e -> (e % 2 == 0) ? "Cut" : "Tek";
        System.out.println(eded.apply(19));

        Function<Integer, String> reqem = r -> (r % 2 == 0) ? "Cut" : "Tek";
        System.out.println(reqem.apply(10));

        Function<Integer, String> ededi = e -> (e % 2 == 0) ? "Cut" : "Tek";
        System.out.println(ededi.apply(17));
    }
}
