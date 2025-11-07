package org.example.constructors;

public class PersonMethods {

    public Person person;

    public PersonMethods(Person person) {
        this.person = person;
    }

    public void add() {
        System.out.println("Elave olund.:" + person.name);
    }

    public void delete() {
        System.out.println("Silindi.:" + person.no);
    }


    public void dataPerson() {
        System.out.println("Ad.:" + person.name);
        System.out.println("Soyad .: " + person.surname);
        System.out.println("No.:" + person.no);
        System.out.println("Ata adi.:" + person.fatherName);
        System.out.println("Ana adi.:" + person.motherName);
        System.out.println("Dogum ili.:" + person.dogumTarixi);

    }


}
