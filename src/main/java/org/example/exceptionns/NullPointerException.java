package org.example.exceptionns;

public class NullPointerException {
    public static void main(String[] args) {

        String message;
        try {
            message = null;
            message = message.toUpperCase();
            System.out.println(message);
        } catch (java.lang.NullPointerException e) {
            System.out.println(e + " Xeta!");
        } finally {
            System.out.println("Finally blok has been ready!");
        }
    }
}
