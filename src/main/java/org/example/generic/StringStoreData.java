package org.example.generic;

import java.util.ArrayList;
import java.util.List;

public class StringStoreData implements Data<String> {

    private List<String> list = new ArrayList<>();


    @Override
    public void add(String item) {
        list.add(item);

    }

    @Override
    public String get(int index) {
        return list.get(index);
    }
}
