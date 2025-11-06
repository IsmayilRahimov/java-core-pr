package org.example.accesmodifier;

import java.util.Scanner;

public class ScannerInputPrivate {

    public static void main(String[] args) {
        MethodsPrivateScanner m2 = new MethodsPrivateScanner();
        Scanner input = new Scanner(System.in);
        System.out.println("Adinizi daxil edin:");
        String name = input.nextLine();
        System.out.println("Yasinizi daxil edin:");
        int age = input.nextInt();
        System.out.println("Maas gozlentinizi daxil edin:");
        int salary = input.nextInt();
        System.out.println("Ve sonda soyadinizi daxil edin:");
        String surname = input.nextLine();


        m2.setName(name);
        m2.setAge(age);
        m2.setSalary(salary);
        m2.setSurname(surname);
        System.out.println(m2);
    }

}
