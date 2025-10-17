package org.example.lambdaexpression.predicatelambda;

import java.util.function.Predicate;

public class LambdaPredicate {
    public static void main(String[] args) {
        Predicate<Integer> num = n -> n % 2 == 0;
        System.out.println(num.test(10));
        Predicate<Integer> eded = n -> n % 2 != 0;
        System.out.println(eded.test(999));

    }
}
