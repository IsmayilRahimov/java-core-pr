package org.example.lambdaexpression.functionlambda;

import java.util.function.Function;

public class LambdaZFun {

    public static void main(String[] args) {
        Function<Integer, String> num = n -> (n % 2 == 0) ? "Cut" : "Tek";
        System.out.println(num.apply(10));
        Function<Integer, String> eded = a -> (a % 2 == 0) ? "Cut" : "Tek";
        System.out.println(eded.apply(20));
        eded.apply(10);

    }
}
