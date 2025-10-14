package org.example.accesmodifier;

public class AccesPerson {

    private String name;   // yalniz person classi icinde gorunur:
    int age;          // default
    protected String address;  // eyni paket subclass ucunde gorunur:
    public String email;  // her yerden cagirila biler:


    public AccesPerson(String name, int age, String addres, String email) {
        this.name = name;
        this.age = age;
        this.address = addres;
        this.email = email;
    }

    private void secretMethod() {
        System.out.println("This is Secret !");
    }

    public void showInfo() {
        System.out.println("Name" + name);
        System.out.println("Age" + age);
        System.out.println("Addres" + address);
        System.out.println("Email" + email);
    }


}
