package org.example.generic;

public class GenClass<T> {

    private T type;

    public T getType() {
        return type;
    }

    public void setType(T type) {
        this.type = type;
    }

    public <T> void showType(T type) {
        System.out.println(type + " <T>");
    }

    public static void main(String[] args) {
        GenClass<String> g1 = new GenClass<>();
        g1.setType("Object");
        System.out.println(g1.getType());
        g1.showType(1);


    }
}
