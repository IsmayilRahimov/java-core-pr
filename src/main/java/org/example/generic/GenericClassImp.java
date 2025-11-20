package org.example.generic;

import java.util.ArrayList;
import java.util.List;

public class GenericClassImp<T> implements Data<T> {
    private List<T> list = new ArrayList<>();

    @Override
    public T get(int index) {
        return list.get(index);
    }

    @Override
    public void add(T item) {
        list.add(item);


    }
}
