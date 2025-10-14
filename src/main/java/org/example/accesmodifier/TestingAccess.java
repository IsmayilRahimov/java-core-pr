package org.example.accesmodifier;

public class TestingAccess {
    public static void main(String[] args) {
        AccesPerson a1 = new AccesPerson("Ali", 15, "Baku ", "Ali123@gmail.com");

        a1.showInfo();
        System.out.println(a1.email);
        System.out.println();


        ProtectedAccess p1 = new ProtectedChild();
        p1.showMessage("Anar: ");
        ProtectedChild p2 = new ProtectedChild();
        p1.showMessage("Ali");

        DefaultModifier s1 = new DefaultModifier();
        s1.name = "Anar";
        s1.getMessage("Anar");
    }
}
