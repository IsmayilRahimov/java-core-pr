package org.example.finals;

public class Enemy {

    public String name;
    public int health;
    public final int finalDeyer;
    public static double PI = 3.1415926;
    public static final double TAX_RATE = 15;

    public Enemy(String name, int health) {
        this.name = name;
        this.health = health;
        finalDeyer = 10;
    }

    public final void boom() {
        PI = 15;
        System.out.println("Boom!");

    }
}
