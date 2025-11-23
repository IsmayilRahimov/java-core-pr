package org.example.genericclaude;

public class KeyValueGeneric<K, V> {
    private K key;
    private V value;

    public KeyValueGeneric(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }


    public static void main(String[] args) {
        KeyValueGeneric<Integer, String> stringKeyValueGeneric = new KeyValueGeneric<>(404, "Not Found");
        System.out.println(stringKeyValueGeneric.getKey());
        System.out.println(stringKeyValueGeneric.getValue());
    }
}
