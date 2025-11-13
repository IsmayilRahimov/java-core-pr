package org.example.generics;

public class GeneralExample<T, K> {

    private T age;

    private K person;


    public GeneralExample(T age, K person) {
        this.age = age;
        this.person = person;
    }

    public T getAge() {
        return age;
    }

    public void setAge(T age) {
        this.age = age;
    }

    public K getPerson() {
        return person;
    }

    public void setPerson(K person) {
        this.person = person;
    }

    public void showGenerics() {
        System.out.println(age + " yasiniz: " + person + " Adiniz:");

    }


    public static void main(String[] args) {
        GeneralExample<Integer, String> general = new GeneralExample<>(25, "MUSA");
        general.showGenerics();

    }
}
