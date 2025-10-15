package org.example.exceptionares;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class IoExceptionHandling {
    public static void main(String[] args) throws FileNotFoundException {
        try {


            FileReader file = new FileReader("Olmayan fayl");
        } catch (IOException e) {
            System.out.println("Fayl tapilmadi:" + e);
        }
    }
}
