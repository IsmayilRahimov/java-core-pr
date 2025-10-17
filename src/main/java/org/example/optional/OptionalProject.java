package org.example.optional;

import java.util.Optional;

public class OptionalProject {
    public static void main(String[] args) {
        Optional<String> names = Optional.ofNullable(null);

        System.out.println(names.isPresent());

        String result = names.orElse("Bilinmeyen");
        System.out.println(result);

        Optional<String> fa = Optional.ofNullable("null");
        Optional<String> na = fa.map(String::toUpperCase);
        System.out.println(na.orElse("Empty"));

        Optional<String> m1 = Optional.ofNullable(null);
        Optional<String> m2 = m1.map(String::toUpperCase);
        System.out.println(m2);

        Optional<String> m3 = m2.map(String::toUpperCase);
        System.out.println(m3);

        Optional<String> m4 = Optional.ofNullable("Vaqif");
        Optional<String> m5 = m4.map(String::toUpperCase);
        System.out.println(m5.orElse(null));
    }
}
