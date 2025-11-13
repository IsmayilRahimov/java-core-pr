package org.example.finals;

public class Box<T> {
    private T value;

    public void set(T value) {
        this.value = value;
    }


    public T get() {
        return value;
    }

    public static void main(String[] args) {
        Box<String> box1 = new Box<>();
        box1.set("Salam");
        System.out.println(box1.get());
    }
}
