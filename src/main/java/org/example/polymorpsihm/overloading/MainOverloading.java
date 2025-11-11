package org.example.polymorpsihm.overloading;

public class MainOverloading {
    public static void main(String[] args) throws RuntimeException {

        MathClass mathClass = new MathClass();
        mathClass.add(10, 20);

        try {
            mathClass.add(0, 10, 20);

        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
