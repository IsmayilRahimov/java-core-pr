package org.example.genericclaude;

public class Bounded {
    public static <T extends Number> double cem(T eded1, T eded2) {
        return eded1.doubleValue() + eded2.doubleValue();
    }

    public static <N extends Number> int show(N reqem1, N reqem2) {
        return reqem1.intValue() + reqem2.intValue();
    }


    public static void main(String[] args) {
        cem(10.2, 20.3);
        double netice = cem(10.2, 20.3);
        System.out.println(netice);

        Integer sum = show(20, 20);
        System.out.println(sum);
    }
}
