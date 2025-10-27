package org.example.optionalnull;

public class SleppedEx {
    public static void main(String[] args) {
        System.out.println("Baslayir");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("2 saniye sora davam etdi/:");
    }
}
