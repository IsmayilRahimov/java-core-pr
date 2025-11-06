package org.example.accesmodifier;

public class MethodsPrivateScanner {

    private String name;
    private int age;
    private String surname;
    private int salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty()) {
            System.out.println("Adinizi duzgun daxil edin - Bosh ola bilmez!");
        } else {
            this.name = name;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        try {
            if (age > 100) {
                throw new RuntimeException("Xeta bas verdi yas 100-den yuxari ola bilmez!");
            } else {
                this.age = age;
            }
        } catch (Exception e) {
            e.getStackTrace();
        }
    }


    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        if (salary > 5000 && salary < 500) {
            throw new RuntimeException("Xeta bas verdi .Maas  telebinizi dogru qeyd edin!");
        }
        this.salary = salary;
    }

    @Override
    public String toString() {
        String all = name + ":Ad " + surname + ":Soyad " + salary + ":Maas " + age + ":Dogum iliniz:";
        return all;
    }
}
