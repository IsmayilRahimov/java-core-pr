package org.example.generics;

public class Pair<K, V> {

    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public void show() {
        System.out.println(key + " : " + value);
    }

    public static void main(String[] args) {
        Pair<String, Integer> user = new Pair<>("Age", 25);
        user.show();
    }
}
