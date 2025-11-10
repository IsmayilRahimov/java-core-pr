package org.example.oca;

public class OcaArrayBoundsQuestions {

    public static void main(String[] args) {
        int[] array = {5, 0, 2};

        try {
            for (int i = 0; i <= array.length; i++) {
                System.out.println(10 / array[i]);
            }
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index error");
        } finally {
            System.out.println("Finally block");
        }

    }
}
