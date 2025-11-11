package org.example.polymorpsihm;

public class PolymorpishmMain {

    public static void main(String[] args) {
        Employe employe;
        employe = new Designer();
        employe.calculateSalary();
        employe = new SoftWareDeveloper();
        employe.calculateSalary();

        Payment payment;
        payment = new CashPay();
        payment.pay(100);
        payment = new CreditPay();
        payment.pay(500);
    }
}
