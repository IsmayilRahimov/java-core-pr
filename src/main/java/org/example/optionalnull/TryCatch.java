package org.example.optionalnull;

public class TryCatch {
    public static void main(String[] args) {
        System.out.println("Program has been started:");

        try {
            Thread.sleep(1500);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Loading");
    }
}
