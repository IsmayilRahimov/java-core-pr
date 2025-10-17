package org.example.lambdaexpression.consumerlambda;

import java.util.function.Consumer;

public class ConsumerLambda {
    public static void main(String[] args) {
        Consumer<String> ad = n -> System.out.println("Name :" + n);
        ad.accept("Azay");
        ad.accept("Faiq");
        ad.accept("Musa");
    }
}
