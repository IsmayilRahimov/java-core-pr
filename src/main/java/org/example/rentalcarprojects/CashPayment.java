package org.example.rentalcarprojects;

public class CashPayment implements Payment {

    @Override
    public void pay(double amount) {
        System.out.println(amount + " Azn negd olaraq odendi.");
    }
}
