package org.example.throwsexceptions;

public class NumberFormat {

    /*
    NumberFormat exceptions
     */

    public static void main(String[] args) {
        try {
            int num = Integer.parseInt("a");
            System.out.println();
        } catch (NumberFormatException e) {
            System.out.println("Xeta bas verdi:Xetanin sebebi--" + e.getMessage());
        } finally {
            System.out.println("Xeta olsada olmasada bu proqram calisacaq!");
        }
    }
}
