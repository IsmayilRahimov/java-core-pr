package org.example.controlflow;

public class DaySwitch {
    public static void main(String[] args) {
        int day = 7;

        switch (day) {
            case 1:
                System.out.println("Bazar ertesi");
                break;
            case 2:
                System.out.println("Cersenbe axsami");
                break;
            case 3:
                System.out.println("Cersenbe");
                break;
            case 4:
                System.out.println("Cume axsami");
                break;
            case 5:
                System.out.println("Cume");
                break;
            case 6:
                System.out.println("Senbe");
                break;
            case 7:
                System.out.println("Bazar");
                break;
        }
    }
}
