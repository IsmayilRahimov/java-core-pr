package org.example.methodstring;

public class StringSwitch {
    public static void main(String[] args) {
        String no = "1463964857";
        char m = no.charAt(5);


        switch (m) {
            case '1':
                System.out.println("01.02.2025");
                break;
            case '3':
                System.out.println("01.03.2025");
                break;
            case '4':
                System.out.println("01.04.2025");
                break;
            default:
                System.out.println("Xeta!");
                break;
        }
    }
}
