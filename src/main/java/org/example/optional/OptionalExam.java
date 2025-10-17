package org.example.optional;

import java.util.Optional;

public class OptionalExam {
    public static void main(String[] args) {
        Optional<String> ad = Optional.ofNullable(null);
        System.out.println(ad.isPresent());
        System.out.println(ad);

        String name = ad.orElse("Amin");
        System.out.println(name );
    }
}
