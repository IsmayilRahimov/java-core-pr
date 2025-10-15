package org.example.exceptionhandling;

import java.io.IOException;

public class StaticException {

    public static void yasDogrulama(int age) throws IOException {
        if (age > 18) {
            throw new IOException("Yasiniz 18 den boyuk oldugu ucun qapalidir:");
        } else if (age < 18) {
            System.out.println("Buyurun daxil olun:");
        }
    }

    public static void main(String[] args) {
        try {
            yasDogrulama(19);
        } catch (IOException e) {
            System.out.println(e.getMessage() + "Xeta bas verdi:");
        }
    }
}
