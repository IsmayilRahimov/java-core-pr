package org.example.generic;

public interface Data<T> {
    void add(T item);

    T get(int index);

}
