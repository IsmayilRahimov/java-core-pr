package org.example.exceptionscatch;

import java.util.Scanner;

public class CarCheckSales {

    public static void showSpeed(int age, double speed) throws AgeExceptionn, SpeedException {
        boolean hasError = false;
        if (age > 2026) {
            throw new AgeExceptionn("Masinin ilini dogru qeyd edin:Gelecekde yasamiriq :)");
        }
        if (speed < 26) {
            throw new SpeedException("Masinin sureti gozlenilen suretden asagi oldugu ucun secilmedi:");
        }
        if (age < 0) {
            throw new AgeExceptionn("Masinin ili 0-dan kicik ola bilmez:");
        }
        if (speed < 0) {
            throw new SpeedException("Masinin sureti 0-dan kicik ola bilmez:");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.println("Secmek istediyiniz masinin ilini qeyd edin:");
            int age = input.nextInt();
            System.out.println("Secdiyiniz masina suret deyerini teyin edin:");
            double speed = input.nextInt();
            showSpeed(age, speed);
        } catch (AgeExceptionn e) {
            System.out.println("Xeta bas verdi: " + e.getMessage());
        } catch (SpeedException e) {
            System.out.println("Xeta bas verdi:" + e.getMessage());
        } catch (Exception e) {
            System.out.println("Diger xetalar bas vererse:");
        } finally {
            System.out.println("Novbeti seyfeye kecid:");
        }
        input.close();
    }
}
