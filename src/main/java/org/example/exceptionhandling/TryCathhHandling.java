package org.example.exceptionhandling;

public class TryCathhHandling {

    int age;

    public void checkage2(int age) throws Exception {
        if (age < 18) {
            throw new Exception("Yasiniz az oldugu ucun daxil ola bilmersiz:");
        } else {
            System.out.println("Daxil ola bilersiniz:");
        }

    }

    public static void main(String[] args) {
        TryCathhHandling t1 = new TryCathhHandling();
        try {
            t1.checkage2(15);
        } catch (Exception e) {
            System.out.println(e.getMessage() + "Xeta bas verdi:");
        }
    }
}
