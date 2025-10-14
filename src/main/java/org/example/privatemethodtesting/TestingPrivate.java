package org.example.privatemethodtesting;

import org.example.accesmodifier.DefaultModifier;
import org.example.accesmodifier.PrivateMethod;
import org.example.accesmodifier.PrivateMethodAccess;

public class TestingPrivate {

    public static void main(String[] args) {
        PrivateMethod p1 = new PrivateMethod();
        //       p1.showMessage();  // method private oldugu ucun diger packageden cagirmaq olmur:
        DefaultModifier s1 = new DefaultModifier();
        // default cagirmaq mumkun deyil:
        PrivateMethodAccess t1 = new PrivateMethodAccess();
        t1.setName("Anar");
        System.out.println(t1.getName());

    }
}
