package org.example.inheritance;

public class Worker {
    public int id;
    public String name;
    public String surname;
    public String email;
    public String phoneNumber;
    public int age;
    public int salary;

    public Worker() {
    }

    public Worker(int id ,String name, String surname, String email, String phoneNumber, int age, int salary) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.salary = salary;
    }

}


