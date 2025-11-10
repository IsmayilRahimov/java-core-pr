package org.example.oca;

public class OcaExceptionsQuestion {
    public static void main(String[] args) {
        int[] array = {2, 4, 6};

        try {
            for (int i = 0; i <= array.length; i++) {
                System.out.println(10 / array[i]);
            }
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic error");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index error");
        } finally {
            System.out.println("Done");
        }
    }
}
