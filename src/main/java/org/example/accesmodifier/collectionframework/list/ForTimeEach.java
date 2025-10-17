package org.example.accesmodifier.collectionframework.list;

import java.util.ArrayList;
import java.util.List;

public class ForTimeEach {

    public static void main(String[] args) {
        List<Integer> num = new ArrayList<>();
        num.add(1);
        num.add(2);
        num.add(3);

        List<Integer> yeni = new ArrayList<>(); // yeni bir siyahi yaradiriq
        for (Integer eded : num) { // num siyahsini eded deyisenine hamsini veririk
            if (!eded.equals(2)) { // ifin icersinde eger eded deyisenin 2ci yoxdusa
                yeni.add(eded); // ededin icerisine
            }
        }
    }
}
