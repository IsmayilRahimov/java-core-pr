package org.example.throwsexceptions;

public class BankAccount {
    private String owner;
    private double balance;

    public BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public void deposit(double amount) throws InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Kocurulecek pul 0'dan boyuk olmalidir");
        }
        balance += amount;
        System.out.println(amount + "Azn kocuruldu.Sizin yeni balans :" + balance);
    }

    public void withDraw(double amount) throws InvalidAmountException , InsufficientBalanceException {
        if (amount <= 0) {
            throw new InvalidAmountException("Cixarilacaq pul 0-dan boyuk olmalidir:");
        }
        if (amount > balance) {
            throw new InsufficientBalanceException("Balansiniz yeterli qeder deyil!. Movcud balansiniz: " + balance);
        }
        balance -= amount;
        System.out.println(amount + "Azn cekildi: Yeni balans" + balance);

    }

    public double getBalance() {
        return balance;
    }
}
