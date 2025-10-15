package org.example.exceptionscatch;

public class SpeedException extends Exception {
    public SpeedException(String message) {
        super("Suret asagidir:" + message);
    }
}
