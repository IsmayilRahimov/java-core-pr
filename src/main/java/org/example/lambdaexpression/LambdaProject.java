package org.example.lambdaexpression;

import java.util.ArrayList;
import java.util.List;

public class LambdaProject {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Azad");
        names.add("Afiq");
        names.add("Ali");
        names.add("Faiq");
        names.add("Vuqar");

        System.out.println("Ilkin halda adlar: " + names);

        names.removeIf(n -> n.equals("Vuqar"));
        System.out.println(names + " remove if ile sildikden sora qalan adlar:");

        for (String ad : names) {
            System.out.println("Siralama ile adlar :" + ad);
        }
    }
}
