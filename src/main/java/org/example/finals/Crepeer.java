package org.example.finals;

public class Crepeer extends Enemy {

    public Crepeer(String name, int health) {
        super(name, health);
    }

    public static final int CONSTANT_FINAL = 25;
    public static final int MAX_SPEED = 250;

    public static final void showConstant() {
        System.out.println(CONSTANT_FINAL);
        System.out.println(MAX_SPEED);
    }

    public static void main(String[] args) {
        showConstant();
    }


}
