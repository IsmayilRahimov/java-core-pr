package org.example.oca;

public class OcaWhile {

    public static void main(String[] args) {
        int x = 0;
        int y = 0;

        while (x < 3) { // x=1; y=1; x=2; y=3; x=3; y= 6;
            x++;
            y += x;
            if (y > 3) {
                break;
            }
        }
        System.out.println(y);
    }
}
