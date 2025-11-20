package org.example.generic;

public class GenericsClassUpl<T> {
    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public static void main(String[] args) {
        GenericsClassUpl<String> gen = new GenericsClassUpl<>();
        gen.set("Generics set Methods");
        System.out.println(gen.value);
        GenericsClassUpl<Integer> generics2 = new GenericsClassUpl<>();
        generics2.set(404);
        System.out.println(generics2.getValue());
        System.out.println(generics2.value);
    }


}
