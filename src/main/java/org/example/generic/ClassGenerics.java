package org.example.generic;

public class ClassGenerics<T, K> {

    private T key;
    private K values;

    public T getKey() {
        return key;
    }

    public void setKey(T key) {
        this.key = key;
    }

    public K getValues() {
        return values;
    }

    public void setValues(K values) {
        this.values = values;
    }

    public void valuesWithKey(T key, K values) {
        System.out.println(key + "-Methods key with-" + values + " Values");

    }

    public static void main(String[] args) {
        ClassGenerics<Integer, String> withId = new ClassGenerics<>();
        withId.valuesWithKey(404, "Not Found!");

    }
}
