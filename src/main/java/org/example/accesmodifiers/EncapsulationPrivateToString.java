package org.example.accesmodifiers;

public class EncapsulationPrivateToString {

    private String name;

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDay(int day) {
        this.day = day;
    }

    private String surname;
    private int day;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getDay() {
        return day;
    }

    @Override
    public String toString() {
        return "EncapsulationPrivateToString{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", day=" + day +
                '}';
    }

    public static void main(String[] args) {
        EncapsulationPrivateToString to = new EncapsulationPrivateToString();

        to.setName("Ragim");
        to.setDay(14);
        to.setSurname("Ragimov");
        System.out.println(to.toString());
    }
}
