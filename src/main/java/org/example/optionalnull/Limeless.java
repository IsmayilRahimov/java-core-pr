package org.example.optionalnull;

import java.util.Optional;

public class Limeless {
    public static void main(String[] args) {
        Optional<String> map = Optional.ofNullable(null);
        String deyer = map.orElse("Hecne bos qaytar:");
        Optional<String> mapless = Optional.ofNullable("Samir");
        String xerite = mapless.orElseThrow(() -> new RuntimeException("Eger hecne yoxdusa bunu qaytar:"));
        Optional<Integer> eded = Optional.ofNullable(null);
        Integer reqem = eded.orElseGet(() -> (2));
        System.out.println(reqem);
    }
}
