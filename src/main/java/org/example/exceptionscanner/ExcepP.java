package org.example.exceptionscanner;

public class ExcepP {
    public static void main(String[] args) throws Exception {
        int a = 0;
        int b = 10;
        try {
            int x = b / a;
        } catch (Exception e) {
            System.out.println("Xeta" + e.getStackTrace());

        }
    }
}
