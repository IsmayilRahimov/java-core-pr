package org.example.accesmodifier.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IterForEach {

    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("A");
        list1.add("B");
        list1.add("C");
        System.out.println("Hal hazirdaki" + list1);
        Iterator<String> list2 = list1.iterator();

        while (list2.hasNext()) {
            String alphabet = list2.next();
            System.out.println("Current" + alphabet);

            if (alphabet.equals("A")) {
                list2.remove();

            }
        }
        System.out.println(list1 + "Silindikden sonra");

    }
}
