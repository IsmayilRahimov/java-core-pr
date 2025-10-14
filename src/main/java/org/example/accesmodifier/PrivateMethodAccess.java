package org.example.accesmodifier;

public class PrivateMethodAccess {

    private String name;

    private String showMessage(String name) {
        return name + " Private mehtod";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
