package org.example.multithreading;

public class MyThread extends Thread {
    public void run() {
        for (int i = 0; i <= 3; i++) {
            System.out.println(getName() + " isleyir " + i);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                System.out.println("Proqram davam edir:");
            }
        }
    }
}
