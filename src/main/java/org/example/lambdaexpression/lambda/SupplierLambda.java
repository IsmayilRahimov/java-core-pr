package org.example.lambdaexpression.lambda;

import java.util.function.Supplier;

public class SupplierLambda {

    public static void main(String[] args) {
        Supplier<Double> randomnum = () -> Math.random();
        System.out.println(randomnum.get());

        Supplier<Double> tesaduf = () ->  Math.random();
        System.out.println(tesaduf.get());
    }
}
