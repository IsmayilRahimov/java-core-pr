package org.example.lambdaexpression.lambda;

import java.util.function.Consumer;

public class ConsumerLambda {
    public static void main(String[] args) {


        Consumer<String> printname = name -> System.out.println("Salam: " + name);

        printname.accept("Anar");

        Consumer<String> nameless = n -> System.out.println("Ad" + n);
        nameless.accept("Vaqif");

        Consumer<String> adsiz = a -> System.out.println("Adsiz:" + a);
        adsiz.accept("Ali");
        Consumer<String> adli = a -> System.out.println("Adli:" + a);
        adli.accept("sa,mir:l");

        Consumer<String> names = n-> System.out.println(n + "Name adi");
        names.accept("Azar:l");

    }
}
