package org.example.ifelseif;

import java.util.Scanner;

public class PasswordWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String password;
        String username;
        int cehd = 0;

        while (cehd < 3) {
            System.out.println("Username daxil edin:");
            username = input.nextLine();
            System.out.println("Paswword daxil edin:");
            password = input.nextLine();

            if (username.equals("Admin") && password.equals("1234")) {
                System.out.println("Daxil oldunuz! " + "Xos geldin Admin!");
            } else if (username == null || password == null || username.isEmpty() || password.isEmpty()) {
                System.out.println("Bos setr buraxila bilmez zehmet olmasa duzgun xanalari doldurun!");
                break;
            } else {
                System.out.println("Duzgun sifre daxil edin!" + "ve yeniden cehd edin:");
                cehd++;
            }
            if (cehd == 3) {
                System.out.println("3 defe cehd limitini kecdiniz!");
            }

        }
        input.close();

    }
}
