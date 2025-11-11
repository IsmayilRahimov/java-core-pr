package org.example.inheritance;

public class TestMain {

    public static void main(String[] args) {
        Programmer programmer = new Programmer();
        Programmer p = new Programmer(1, "Ismayil", "Rehimov", "ragimov@gmail.com", "0554555555", 25, 2000);
        System.out.println(p.toString());


    }
}
