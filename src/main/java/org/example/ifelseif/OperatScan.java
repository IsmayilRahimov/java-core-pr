package org.example.ifelseif;

public class OperatScan {
    public static void main(String[] args) {
        int eded;
        eded = 7;

//        if (eded < 20 && eded % 2 == 0) {
//            System.out.println("Dogru");
//        } else {
//            System.out.println("False");
//        }
        if (eded > 10 || eded % 2 == 0) {
            System.out.println("Dogru");
        } else {
            System.out.println("Yalnis");
        }
        if (eded%2==0){
            System.out.println("cut");
        }else {
            System.out.println("tek");
        }

    }
}
