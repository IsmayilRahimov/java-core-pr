package org.example.accesmodifier.collectionframework.list;

import java.util.ArrayList;
import java.util.List;

public class IchFor {
    public static void main(String[] args) {

        List<Integer> num = new ArrayList<>();
        num.add(1);
        num.add(3);
        num.add(5);

        num.removeIf(n -> n.equals(1));
        System.out.println(num);
    }
}
