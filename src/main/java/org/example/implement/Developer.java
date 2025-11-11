package org.example.implement;

public class Developer implements User {

    @Override
    public void userName() {
        System.out.println("Username -ragimov");
    }

    @Override
    public void password() {
        System.out.println("1234");

    }
}
