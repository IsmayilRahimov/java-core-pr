package org.example.privatemethodtesting;

import org.example.accesmodifier.DefaultModifier;
import org.example.accesmodifier.PrivateMethod;

public class TestingPrivate {

    public static void main(String[] args) {
        PrivateMethod p1 = new PrivateMethod();
        //       p1.showMessage();  // method private oldugu ucun diger packageden cagirmaq olmur:
        DefaultModifier s1 = new DefaultModifier();
        // default cagirmaq mumkun deyil:
    }
}
