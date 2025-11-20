package org.example.generic;

import java.util.ArrayList;
import java.util.List;

public class UnknownType {

    List<?> list = new ArrayList<String>();

    List<? extends Number> listNumber = new ArrayList<>();


    public static void main(String[] args) {

        UnknownType e = new UnknownType();

        e.list.add(null);

    }

}
