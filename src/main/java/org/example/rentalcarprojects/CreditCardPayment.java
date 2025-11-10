package org.example.rentalcarprojects;

public class CreditCardPayment implements Payment {

    @Override
    public void pay(double amount) {
        System.out.println(amount + " Azn Kredit karti ile odendi.");
    }
}
