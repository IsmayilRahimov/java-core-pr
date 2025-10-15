package org.example.finalproject;

public class Outer {
    static String title = "Static Inner class ucun";
    String name = "Non-Static Inner class ucun";

    static class InnerStatic {
        void show() {
            System.out.println("Inner Static class" + title);
        }
    }

    class InnerNormal {
        void show() {
            System.out.println("Normal Inner Class" + name);
        }

        public static void main(String[] args) {
            Outer outer = new Outer();
            InnerNormal n1 = outer.new InnerNormal();
            n1.show();

            InnerStatic n2 = new InnerStatic();
            n2.show();
        }
    }
}


