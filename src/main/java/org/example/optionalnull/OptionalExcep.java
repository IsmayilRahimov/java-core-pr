package org.example.optionalnull;

import java.util.Optional;

public class OptionalExcep {
    public static void main(String[] args) {
        Optional<String> nam = Optional.of("Salam");
        System.out.println(nam.get());
//        Optional<String> name = Optional.ofNullable(null);
//        name.get(); // NullExceptions
        Optional<String> ma = Optional.ofNullable(null);
        System.out.println(ma.orElse("Samir")); // eger deyer yoxdursa default deyer qaytarir

        Optional<String> li = Optional.ofNullable("Samir");
        System.out.println(li.get());

        Optional<String> la = Optional.ofNullable(null);
        String result = la.orElse("Miki");
        String result2 = la.orElseGet(() -> "Generat");
        System.out.println(result);
        System.out.println(result2);

        try {
            String result3 = la.orElseThrow(() -> new RuntimeException("User not found"));
        } catch (RuntimeException e) {
            System.out.println("Xeta");
        }
    }
}
