package org.example.genericclaude;

public class TimeGeneric<T> {

    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public static void main(String[] args) {
        TimeGeneric<Integer> time = new TimeGeneric<>();
        time.setValue(100);
        System.out.println(time.getValue());

    }
}
