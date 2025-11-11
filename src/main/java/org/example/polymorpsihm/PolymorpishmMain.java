package org.example.polymorpsihm;

public class PolymorpishmMain {

    public static void main(String[] args) {
        Employe employe;
        employe = new Designer();
        employe.calculateSalary();
        employe = new SoftWareDeveloper();
        employe.calculateSalary();
    }
}
