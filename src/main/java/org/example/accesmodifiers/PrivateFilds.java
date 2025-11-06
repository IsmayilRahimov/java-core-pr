package org.example.accesmodifiers;

import org.example.accesmodifier.ProtectedAccess;

public class PrivateFilds {

    private String name;

    private int size;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        PrivateFilds p2 = new PrivateFilds();
        p2.name = "Anar";
        System.out.println(p2.name);
        PrivateGetterMethods m9 = new PrivateGetterMethods();

    }
}
