package org.example.exceptionns;

public class NullPointerException {
    public static void main(String[] args) {

        String message;
        try {
            message = null;
            message = message.toUpperCase();
            System.out.println(message);
        } catch (ArithmeticException e) {
            System.out.println("Bir xeta oldu! " + e);
        } catch (java.lang.NullPointerException e) {
            System.out.println("Null xeta bas verdi! " + e);
        } finally {
            System.out.println("Finally blok has been ready!");
        }
    }
}
