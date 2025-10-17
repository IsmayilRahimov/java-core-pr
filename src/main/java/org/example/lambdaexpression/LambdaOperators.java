package org.example.lambdaexpression;

import java.util.ArrayList;
import java.util.List;

public class LambdaOperators {

    public static void main(String[] args) {
        List<Integer> eded = new ArrayList<>();

        eded.add(5);
        eded.add(6);
        eded.add(10);
        eded.add(15);
        eded.add(20);

        eded.removeIf(num -> num == 6 || num == 10);

        for (Integer numbers : eded) {
            System.out.println("Siralama ile " + numbers);


            List<String> names = new ArrayList<>();
            names.add("A");
            names.add("B");
            names.add("C");
            names.add("F");
            System.out.println(names);

            names.forEach(n -> System.out.println(n));
            names.removeIf(m -> m.equals("A"));
            System.out.println(names);

            for (String nam : names) {
                System.out.println(nam);
            }


        }
    }
}
