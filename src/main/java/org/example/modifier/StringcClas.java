package org.example.modifier;

import org.example.polymorpsihm.Payment;
import org.w3c.dom.Text;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class StringcClas {
    public static void main(String[] args) throws SQLException {
        String s = "Java ";
        s = s.concat("Pograming");
        System.out.println(s);

        StringBuilder sb = new StringBuilder("Java Time");
        System.out.println(sb);
        sb.append(" Programing");
        System.out.println(sb);


        try {
            String name = null;
            System.out.println(name.length());

        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }

        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db\",\"root");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        File file;
        try {
            file = new File("Test44.txt");
            FileReader fr = new FileReader(file);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
