package org.example.operators;

public class InstanceOf {
}

class BlackOf extends InstanceOf {
}

class Main {
    public static void main(String[] args) {
        InstanceOf a1 = new InstanceOf();
        BlackOf b1 = new BlackOf();
        System.out.println(a1 instanceof InstanceOf); // true
        System.out.println(a1 instanceof BlackOf);   // false
        System.out.println(b1 instanceof InstanceOf); //true
        System.out.println(b1 instanceof BlackOf);  // true


    }
}
