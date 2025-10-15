package org.example.exceptionscanner;

import java.util.Scanner;

public class PersonCheckProgram {

    public static void chekPerson(int age, double salary) throws AgeException, SalaryException {
        if (age < 18) {
            throw new AgeException("Yas 18-den kicik ola bilmez:");
        }

        if (salary < 0) {
            throw new SalaryException("Maas menfi reqem ola bilmez:");
        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Yasinizi daxil edin:");
            int age = input.nextInt();
            System.out.println("Maasinizi daxil edin:");
            double salary = input.nextInt();
            chekPerson(age, salary);

        } catch (AgeException e) {
            System.out.println("Xeta " + e.getMessage());
        } catch (SalaryException e) {
            System.out.println("Xeta " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Her hansi bir xeta:");
        } finally {
            System.out.println("Proqram sona catdi:");
        }
        input.close();
    }
}
