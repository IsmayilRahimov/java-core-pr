package org.example.modifier;

public class StringcClas {
    public static void main(String[] args) {
        String s = "Java ";
        s = s.concat("Pograming");
        System.out.println(s);

        StringBuilder sb = new StringBuilder("Java Time");
        System.out.println(sb);
        sb.append(" Programing");
        System.out.println(sb);


        try {
            String name = null;
            System.out.println(name.length());

        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }
}
