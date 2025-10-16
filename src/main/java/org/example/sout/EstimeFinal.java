package org.example.sout;

import static org.example.sout.FinalMethodAndFinalClass.age;

public class EstimeFinal {
    public static void main(String[] args) {
        FinalMethodAndFinalClass.showtime();
        FinalMethodAndFinalClass f1 = new FinalMethodAndFinalClass();
        f1.read();
        FinalMethodAndFinalClass.aged(15);
        System.out.println(FinalMethodAndFinalClass.aged(20)); // bu methodun deyiseni
        System.out.println(age); // bu class seviyesinde deyisen

    }
}
