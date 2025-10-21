package org.example.optionalnull;

import java.util.Optional;

public class OptionalNull {

    public static void main(String[] args) {
        Optional<String> names = Optional.ofNullable(null);
        String name1 = names.orElse("BU deyisen deyeri null olsa bunu qaytar");
        System.out.println(name1);

        String name2 = names.orElseGet(() -> "Null olmasa :");
        System.out.println(name2);

        String name3 = names.orElseGet(() -> "Musa dont like:");
        System.out.println(name3);


    }
}
