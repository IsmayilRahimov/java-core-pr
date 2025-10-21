package org.example.optionalnull;

import java.util.Optional;

public class NullDeyerEc {

    public static void main(String[] args) {

        Optional<String> list = Optional.ofNullable(null);// konteyner icindde null
        String resultlist = list.orElse("Null deyer qaytarma:"); // icinde deyer varsa onu qaytar eger yoxdursa bu setr ise dus:
        System.out.println(resultlist);

        String result2 = list.orElseGet(() -> "Deyer olmayanda bu setr islesin bu deyeri elave etsin");
        System.out.println(result2);

        String result3 = list.orElseThrow(() -> new RuntimeException("Null deyer olarsa xeta at"));


    }
}
