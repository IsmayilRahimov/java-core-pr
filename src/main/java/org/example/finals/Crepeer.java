package org.example.finals;

public class Crepeer extends Enemy {

    public Crepeer(String name, int health) {
        super(name, health);
    }

    public static final int CONSTANT_FINAL = 25;

    public void showConstant() {
        System.out.println(CONSTANT_FINAL);
    }


}
