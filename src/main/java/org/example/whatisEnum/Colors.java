package org.example.whatisEnum;

public enum Colors {
    RED,
    BLACK,
    WHITE;


    public static void main(String[] args) {

        Colors c1 = Colors.BLACK;
        System.out.println(Colors.BLACK.ordinal());
    }
}
