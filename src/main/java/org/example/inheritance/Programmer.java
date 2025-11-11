package org.example.inheritance;

public class Programmer extends Worker {

    public Programmer() {
    }

    public Programmer(int id, String name, String surname, String email, String phoneNumber, int age, int salary) {
        super(id, name, surname, email, phoneNumber, age, salary);
    }

    @Override
    public String toString() {
        return "Programmer{"
                + "Id: " + id
                + " Name: " + name
                + " Surname:" + surname
                + " Email: " + email
                + " PhoneNumber: " + phoneNumber
                + " Age: " + age
                + " Salary: " + salary;
    }
}
