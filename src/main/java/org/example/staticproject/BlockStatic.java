package org.example.staticproject;

public class BlockStatic {

    static int count;

    static {

        System.out.println("Static blok okey:" + count);
        count = 100;
    }

    public static void main(String[] args) {

        System.out.println(BlockStatic.count);
    }
}
