package org.example.generics;

public class BoxerTime<T> {

    private T value;
    private T name;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public void setName(T name) {
        this.name = name;
    }

    public void run() {
        System.out.println(value + "Deyer" + name);
    }

    public static void main(String[] args) {
        BoxerTime<String> boxer = new BoxerTime<>();
        boxer.set("Yazilan");
        BoxerTime<Integer> boxer2 = new BoxerTime<>();
        boxer2.set(1000);
        System.out.println(boxer2.get());
        System.out.println(boxer.get());
        boxer.run();
        boxer2.run();


    }


}
