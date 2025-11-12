package org.example.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayProject {

    public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
        ArrayList<Character> charakter = new ArrayList<>();
        charakter.add('A');
        charakter.add('B');
        charakter.add('C');
        charakter.isEmpty();
        charakter.add(1, 'C');
        List<String> eded = new ArrayList<>();
        eded.add("Musa");
        eded.add("Samir");
        eded.add("Anar");
        System.out.println(eded.set(0,"Isa"));

        System.out.println();
        System.out.println(eded.contains("Anar"));

        System.out.println();
        for (String name : eded) {
            System.out.println(name);
        }

        try {
            eded.remove(5);
            System.out.println(eded);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Xeta" + e.getMessage());
        }
        System.out.println();
        try {
            eded.get(5);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Xeta "
                    + e.getMessage());
        }

    }
}
