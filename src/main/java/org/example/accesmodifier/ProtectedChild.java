package org.example.accesmodifier;

public class ProtectedChild extends ProtectedAccess {
    @Override
    protected void showMessage(String name) {
        System.out.println("Child  " + name);
    }
}
