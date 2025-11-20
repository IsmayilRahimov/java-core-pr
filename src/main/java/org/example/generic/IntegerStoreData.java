package org.example.generic;

import java.util.ArrayList;
import java.util.List;

public class IntegerStoreData implements Data<Integer> {

    private List<Integer> list = new ArrayList<>();

    @Override
    public Integer get(int index) {
        return list.get(index);
    }

    @Override
    public void add(Integer item) {
        list.add(item);
    }
}
