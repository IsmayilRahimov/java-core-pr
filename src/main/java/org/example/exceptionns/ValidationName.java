package org.example.exceptionns;

public class ValidationName {

    public static void adDogrulama(String name) throws NameValidationException {
        if (name.isEmpty()) {
            throw new NameValidationException("Name cannot be null!");
        }
        if (name == null) {
            throw new NameValidationException("Name cannot be null!");
        }
    }

    public static void main(String[] args) {
        try {
            adDogrulama("");
        } catch (NameValidationException e) {
            System.out.println("Xeta" + e);
        }
    }
}
