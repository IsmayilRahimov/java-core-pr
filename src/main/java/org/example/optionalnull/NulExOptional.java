package org.example.optionalnull;

import java.util.Optional;

public class NulExOptional {
    private String email;

    Optional<String> getEmail() {
        return Optional.ofNullable(email);
    }

    public static void main(String[] args) {
        NulExOptional n1 = new NulExOptional();

        String email = n1.getEmail().orElse("Email tapilmadi:");
        System.out.println(email);
    }
}
