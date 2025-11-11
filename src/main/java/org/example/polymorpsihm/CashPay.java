package org.example.polymorpsihm;

public class CashPay implements Payment {

    @Override
    public void withdraw(double amount) {
        System.out.println("Hesabdan negd cixaris olundu: " + amount);
    }

    @Override
    public void pay(double amount) {
        System.out.println("Odenis nagd olundu :" + amount);

    }
}
