package org.example.accesmodifier.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ForEachList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Banana");
        list.add("Apple");
        list.add("Grape");
        list.add("Lemon");

        Iterator<String> l2 = list.iterator();
        while (l2.hasNext()) {
            String fruit = l2.next();
            System.out.println(fruit);

            if (l2.equals("Banana")) {
                l2.remove();
            }
        }
        System.out.println(list + "Silindikden sora?:");


//        for (String fruit : list) {
//            System.out.println(fruit);
//        }
    }
}
