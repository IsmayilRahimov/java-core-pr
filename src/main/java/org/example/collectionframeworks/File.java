package org.example.collectionframeworks;

import java.io.*;

public class File {

    public static void main(String[] args) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("file.txt"));
        writer.write("Salam \n");
        writer.write("Salam necesen \n");

        String[] name = {"Samir", "Vaqif", "Ali"};

        for (String names : name) {
            writer.write(names + "\n");
            writer.append("Salamlar");
        }

        writer.close();


        BufferedReader reader = new BufferedReader(new FileReader("file.txt"));
        String line;
        while (((line = reader.readLine()) != null)) {
            System.out.println(reader.readLine());
            System.out.println();
        }


    }
}
