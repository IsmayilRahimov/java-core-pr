package org.example.exceptionscatch;

public class YearCheck {

    public static void checkYear(int year) throws AgeExceptionn {
        if (year < 18) {
            throw new AgeExceptionn("Xeta bildirilir: Il teyin olunan datadan asagidir:" + year);
        } else {
            System.out.println(year + "Sizin daxil etdiyiniz il duzgundur:");
        }
    }

    public static void main(String[] args) {
        try {
            checkYear(15);
        } catch (AgeExceptionn e) {
            System.out.println(e.getMessage());
        }
    }
}

