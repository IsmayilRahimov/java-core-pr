package org.example.optionalnull;

import org.example.privatemethods.Person;

public class PrivatePerson {

    private void meet() {
        System.out.println("This is private Person");
    }

    public void shoowMeet() {
        meet();
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.showPrivate();
    }
}
