package org.example.throwsexceptions;

public class MainBalance {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Ismayil ", 2000);
        try {
            bankAccount.deposit(1000);
            bankAccount.withDraw(200);
            bankAccount.withDraw(3000);
        } catch (InvalidAmountException | InsufficientBalanceException e) {
            System.out.println("Hata :" + e.getMessage());
        }

        try {
            bankAccount.deposit(-100);
        } catch (InvalidAmountException | InsufficientBalanceException e) {
            System.out.println("Xeta :" + e.getMessage());
        }
    }
}

