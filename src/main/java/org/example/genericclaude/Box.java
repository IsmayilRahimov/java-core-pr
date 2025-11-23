package org.example.genericclaude;

public class Box<T> { // generic class
    private T flut;

    public T getFlut() {
        return flut;
    }

    public void setFlut(T flut) {
        this.flut = flut;
    }

    public static void main(String[] args) {
        Box<String> qutu = new Box<>();
        qutu.setFlut("Qutunu doldur");
        String messageBox = qutu.getFlut();
        System.out.println(messageBox);

        Box<Integer> karobka = new Box<>();
        karobka.setFlut(404);
        Integer num = karobka.getFlut();
        System.out.println(num);

    }

}
