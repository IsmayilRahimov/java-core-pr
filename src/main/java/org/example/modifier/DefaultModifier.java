package org.example.modifier;

public class DefaultModifier {

    String name;
    public String surname;

    protected String salary;
    private int age;

    protected void showtime() {
        System.out.println(salary + "This is Protected sub!");
    }

}
