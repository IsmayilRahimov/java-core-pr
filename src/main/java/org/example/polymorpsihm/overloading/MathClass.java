package org.example.polymorpsihm.overloading;

public class MathClass {

    public int add(int a, int b) {  // compile time overloading
        return a + b;
    }

    public int add(int a, int b, int c) {
        if (a == 0) {
            throw new RuntimeException("Xeta bas verdi");
        }
        return a / b - c;
    }

}
