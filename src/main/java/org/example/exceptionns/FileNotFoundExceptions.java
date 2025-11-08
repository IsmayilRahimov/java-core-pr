package org.example.exceptionns;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileNotFoundExceptions {

    public static void main(String[] args) {
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream("Test.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Dosya tapilmadi! " + e);
        } finally {
            try {
                if (fileOutputStream != null)
                    fileOutputStream.close();
            } catch (IOException e) {
                System.out.println("Dosya baglanarken xeta bas verdi!");
            }
        }


    }
}
