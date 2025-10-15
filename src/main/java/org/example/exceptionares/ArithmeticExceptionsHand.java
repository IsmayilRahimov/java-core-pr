package org.example.exceptionares;

public class ArithmeticExceptionsHand {
    public static void main(String[] args) {
        try {
            int cem = 10 / 0;
            System.out.println(cem);
        } catch (ArithmeticException e) {
            System.out.println("0-a bolmek olmaz: xeta" + e.getMessage());
        }
    }
}
