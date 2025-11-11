package org.example.privatemethods;

import org.example.optionalnull.PrivatePerson;

public class Person {

    private void add() {
        System.out.println("This is Private!");
    }

    public void showPrivate() {
        add();
    }

    public static void main(String[] args) {
        PrivatePerson p2 = new PrivatePerson();
        p2.shoowMeet();
    }
}
