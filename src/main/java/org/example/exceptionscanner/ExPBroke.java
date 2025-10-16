package org.example.exceptionscanner;


import java.io.FileReader;

public class ExPBroke {

    public static void main(String[] args) throws Exception {

        try {
            FileReader fileReader = new FileReader("Text"); // compile time zamani xeta verir ve Chehked exception novune aiddir:
        } catch (Exception e) {  // try catch ile mutleqdirki xetani tutaq

            System.out.println("Metn yoxdur?" + e.getMessage());
        }
    }
}
