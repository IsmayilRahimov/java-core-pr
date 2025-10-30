package org.example.ifelseif;

import java.util.Scanner;

public class UsernameSc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Username daxil et: ");
        String username = input.nextLine();
        System.out.println("Sifreni daxil et: ");
        String password = input.nextLine();

        if (username.equals("Admin") && password.equals("1234")) {
            System.out.println("Welcome Admin!");
        } else if (username == null || password == null || username.isEmpty() || password.isEmpty()) {
            System.out.println("Username ve Passwordu duzgun daxil edin! Bos ola bilmez!");
        } else {
            System.out.println("Daxil ola bilmediniz yeniden cehd edin:");
        }
    }
}
