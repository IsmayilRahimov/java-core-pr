package org.example.abstractiontest;

public class MainAbstraction {

    public static void main(String[] args) {


        Employee e = new Designer();
        e.show(); // upcasting
        e = new Developer();
        Developer developer = (Developer) e;  // downcasting
        developer.test();

    }
}
