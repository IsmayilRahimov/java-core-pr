package org.example.genericclaude;

public class LotGenerics {

    public static <K, V> void getout(K key, V value) {
        System.out.println("Acar " + key + " Deyer " + value);
    }

    public static <K, V> V showdey(K acar, V deyer) {
        System.out.println(acar + " Key deyeri tapildi");
        return deyer;
    }

    public static void main(String[] args) {
        getout(404, "Not Found");

        showdey(500, "Unautorized");
        String netice = showdey("Melumat", "Tapildi");
        System.out.println(netice);
    }
}
