package org.example.constructors;

public class Composition {
    public static void main(String[] args) {

        Person p1 = new Person
                ("Afiq", "Aliyev", "555", "Musa", "Zeyneb", "2002");
        PersonMethods p2 = new PersonMethods(p1);
        p2.add();
        p2.dataPerson();
        p2.delete();

    }
}
