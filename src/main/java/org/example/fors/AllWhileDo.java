package org.example.fors;

public class AllWhileDo {
    public static void main(String[] args) {

        int i = -9;

        while (i < -5) {
            System.out.println("Eded cap olundu: " + i);
            i++;
        }

        for (int k = 0; k < 5; k++) {
            System.out.println("Eded cap olundu:" + k);
        }

        int m = 0;
        do {
            System.out.println("Cap et" + m);
            m++;
        } while (m < 10);

    }
}
