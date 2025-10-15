package org.example.staticproject;

public class NonStat {

    static String name;

    public String name2;

    public static void slepping(String name) {
        System.out.println(name + "Adiniz");

    }

    public String showmessage(String name2) {
        return "Adiniz:" + name2;

    }

    public static void main(String[] args) {
        NonStat n1 = new NonStat();
        System.out.println(n1.showmessage("Eli"));
        NonStat.slepping("Eli2");


    }
}
