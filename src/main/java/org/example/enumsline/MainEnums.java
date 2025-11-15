package org.example.enumsline;


public class MainEnums {

    public static void main(String[] args) {

        for (Season s : Season.values()) {
            System.out.println(s);
        }

        System.out.println(Season.valueOf("SPRING"));
        System.out.println(Season.valueOf("SUMMER").ordinal());

    }
}
