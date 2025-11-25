package org.example.concurencymultithreading;

import java.util.*;

public class mi6 {
    public static void main(String[] args) {
        Map<Integer, String> students = new HashMap<>();

        students.put(1, "Afiq");
        students.put(2, "Asim");
        students.put(3, "Anar");

        students.put(2, "Afiq");
        System.out.println(students);
        students.remove(2);
        System.out.println(students.get(2));

        for (Integer key : students.keySet()) {
            System.out.println("Id " + key + " Name " + students.get(key));
        }

        Set<String> person = new HashSet<>();
        person.add(null);
        person.add("Afiq");

        person.add(null);
        person.add("Afiq");
        System.out.println(person);

        System.out.println("Xeta");
        person.contains(null);
        System.out.println(person.contains(null));

        for (String per : person) {
            System.out.println(per);
        }

        System.out.println(person.isEmpty());
        System.out.println(person.size());

        List<String> cities = new ArrayList<>();

        cities.add("Baku");
        cities.add("Baku");
        cities.add("Baku");
        cities.add("Baku");
        System.out.println(cities);

        for (String seher : cities) {
            System.out.println(seher);
        }


    }
}


