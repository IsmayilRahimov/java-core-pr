package org.example.abstraction.abstraction5;

public class Main2Abs extends MainAbstract {
    @Override
    String payment() {
        return "Abstract Child";
    }

    @Override
    Integer amount() {
        return 0;
    }

}
