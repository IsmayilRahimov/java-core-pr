package org.example.exceptionhandling;

import java.lang.ArithmeticException;

public class ArrayIndexOfBoundsExcep {
    public static void main(String[] args) {
        try {
            int[] arr = new int[3]; // 0,1,2 indekslerinde olan massiv yaradiriq
            arr[5] = 10; // 5 ci indeks massive elave olunmayib :
        }catch (ArithmeticException e){
            System.out.println("Riyazi sehv");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Massivin serhedi asilmisdir:");
        }catch (Exception e){
            System.out.println("Bilinmeyen sehv bas verdi:");
        }finally {
            System.out.println("Xeta bas versede proqram davam edir:l");
        }


    }
}
