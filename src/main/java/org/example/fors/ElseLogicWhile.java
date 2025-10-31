package org.example.fors;

public class ElseLogicWhile {

    public static void main(String[] args) {
        int i = 0;

        while (i <= 7) {
            if (i == 5) {
                i++;
                continue;
            }
            i++;
            System.out.println(i + "-yoxlamada olan eded");
        }
    }
}
