package org.example.oop.inheritance.polymorphism;

public class StudentsPolymorpishm extends TeacherPolymorphism {

    public String studentsVariable;

    @Override
    void show() {
        System.out.println(studentsVariable + ":Students polymorphism");
    }
}
