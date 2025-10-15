package org.example.exceptionares;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class IoExceptionFile {
    public static void main(String[] args) throws Exception {
        try {
            FileReader fileReader = new FileReader("olmayan.file.txt");
        } catch (FileNotFoundException e) {
            System.out.println(e);

        }

    }
}
