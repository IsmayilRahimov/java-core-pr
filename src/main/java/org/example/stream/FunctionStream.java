package org.example.stream;

import java.util.List;
import java.util.Locale;

public class FunctionStream {
    public static void main(String[] args) {
        List<String> names = List.of("Anar", "Afiq", "Azad");
        List<String> newnames = names.stream()
                .map(name -> name.toUpperCase())
                .toList();
        System.out.println(newnames);
        List<String> oldnames = names.stream()
                .map(n -> n.toLowerCase())
                .toList();
        System.out.println(oldnames);

    }
}
