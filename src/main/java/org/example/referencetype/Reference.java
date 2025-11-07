package org.example.referencetype;

public class Reference {
    public static void main(String[] args) {
        Person insan1 = new Person();
        Person insan2 = insan1;
        insan1.name = "Afiq";
        System.out.println(insan2.name);


    }
}
