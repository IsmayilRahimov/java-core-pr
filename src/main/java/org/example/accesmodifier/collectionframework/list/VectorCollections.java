package org.example.accesmodifier.collectionframework.list;

import java.util.Vector;

public class VectorCollections {
    public static void main(String[] args) {
        Vector<String> v1 = new Vector<>();
        v1.add("Aqil");
        v1.add("Cavid");
        v1.add("Samir");

        System.out.println(v1.capacity());
        System.out.println(v1.firstElement());
    }
}
