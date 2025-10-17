package org.example.lambdaexpression;

import java.util.ArrayList;
import java.util.List;

public class MojnaLamd {
    public static void main(String[] args) {
        List<Integer> num = new ArrayList<>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(5);
        num.add(6);
        num.add(100);

        System.out.println(num + " Hal hazirda:");

        for (Integer a : num) {
            System.out.println("Forun icerisinde num" + a);
        }

        num.removeIf(b -> b.equals(1));
        num.removeIf(b -> b.equals(3));
        System.out.println(num + "Removdan sonra ");
    }
}
