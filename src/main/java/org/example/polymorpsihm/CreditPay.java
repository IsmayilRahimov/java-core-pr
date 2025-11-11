package org.example.polymorpsihm;

public class CreditPay implements Payment {

    @Override
    public void pay(double amount) {
        System.out.println("Credit odenisi ucuun odenilecek mebleg: " + amount);

    }

    @Override
    public void withdraw(double amount) {
        System.out.println("Credit odenisinden sonra cixarilacaq mebleg:" + amount);

    }
}
