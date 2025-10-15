package org.example.exceptionhandling;


public class ExceptionThrows {

    public void checkage(int age) throws Exception {
        if (age < 18) {
            throw new Exception("Yasiniz kicikdir:");
        } else {
            System.out.println("Daxil ola bilersen:");
        }
    }

    public static void main(String[] args) {
        ExceptionThrows e1 = new ExceptionThrows();

        try {
            e1.checkage(16);
        } catch (Exception e) {
            System.out.println("Xeta " + e.getMessage());
        }

    }
}

