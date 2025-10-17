package org.example.lambdaexpression.supplierlambda;

import java.util.Map;
import java.util.function.Supplier;

public class SuplayrLambda {
    public static void main(String[] args) {
        Supplier<Double> doubleSupplier = () -> Math.random();
        doubleSupplier.get();
        System.out.println(doubleSupplier);
    }
}
