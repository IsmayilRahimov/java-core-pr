package org.example.datayps;

public class BooleanTypes {

    public static boolean isEven(int num) {
        return num % 2 == 0;

    }

    public static void main(String[] args) {
        System.out.println(isEven(10));

        String name = "admin";
        String password = "1234";

        boolean isValid = name.equals("admin") && password.equals("1234");
        System.out.println(isValid);

        boolean[] answers = {true, true, true, false};
        for (int i = 0; i < answers.length; i++) {
            if (answers[i]) {
                System.out.println("Dogru cavab");
            } else {
                System.out.println("Yalnis cavab");
            }
        }
    }
}
