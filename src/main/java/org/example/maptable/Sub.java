package org.example.maptable;

import org.example.modifier.DefaultModifier;

public class Sub extends DefaultModifier {

    @Override
    protected void showtime() {
        System.out.println("This is child class!" + salary);
    }
}
