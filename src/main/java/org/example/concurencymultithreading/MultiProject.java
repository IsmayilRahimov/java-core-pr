package org.example.concurencymultithreading;

public class MultiProject extends Thread implements Runnable {
    public void run() {
        System.out.println("My Thread" + Thread.currentThread().getName());
    }
}
