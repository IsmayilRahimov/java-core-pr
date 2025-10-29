package org.example.multithreading;

public class ThreadMain {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread();
        thread1.setName("A");
        MyThread thread2 = new MyThread();
        thread2.setName("B");
        MyThread thread3 = new MyThread();
        thread3.setName("C");

        thread1.start();
        try {
            thread1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        thread2.start();
        thread3.start();
    }
}
