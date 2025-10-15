package org.example.staticproject;

public class StatPrNon {

    static int age = 20;

    static class Out {
        static void sleeper() {
            System.out.println("Age:" + age);
        }

        public static void main(String[] args) {
            Out.sleeper();


        }
    }
}
