package org.example.accesmodifier.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AlForEach {
    public static void main(String[] args) {
        List<Integer> num = new ArrayList<>();
        num.add(1);
        num.add(2);
        num.add(3);

        System.out.println("Listin icindeki ededler:");

        Iterator<Integer> num2 = num.iterator();
        while (num2.hasNext()) {
            Integer eded = num2.next();
            System.out.println("Num 2 hal hazirda:" + num2);

            if (eded.equals(1)) {
                num2.remove();
            }
        }
        System.out.println("Silindikden sonra " + num);
    }
}
