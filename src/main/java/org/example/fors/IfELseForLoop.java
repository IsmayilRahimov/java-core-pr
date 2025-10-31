package org.example.fors;

public class IfELseForLoop {
    public static void main(String[] args) {
        int i = 0;
        while (i <= 6) {
            if (i == 3) {
                i++;
                continue;
            }
            i++;
            System.out.println(i + "-ci eded");
        }
    }
}
