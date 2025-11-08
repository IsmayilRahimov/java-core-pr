package org.example.throwsexceptions;

public class Student {

    public Student add(String id) throws StudentsNotFoundExceptions {

        if (id.equals("1234")) {
            return new Student();
        } else {
            throw new StudentsNotFoundExceptions("Not found Student");
        }
    }
}
