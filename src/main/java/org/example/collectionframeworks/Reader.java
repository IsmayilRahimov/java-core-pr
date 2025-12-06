package org.example.collectionframeworks;

import java.io.*;

public class Reader {
    public static void main(String[] args) throws IOException {
        String[] arrays = {"Car", "Traktor", "Vales"};
        BufferedWriter file = new BufferedWriter(new FileWriter("files.txt"));
        file.append("Salam \n");
        file.write("Aleykum salam\n");
//        file.close();

        for (String arr : arrays) {
            file.append(arr + "\n");
            file.write(arr);
        }
        file.close();

        BufferedReader readFile = new BufferedReader(new FileReader("files.txt"));

        String line;
        while ((line = readFile.readLine()) != null) {
            System.out.println(line);
        }

    }
}
