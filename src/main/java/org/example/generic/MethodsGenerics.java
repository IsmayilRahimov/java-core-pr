package org.example.generic;

public class MethodsGenerics {

    public static <T, K> void print(T item, K values) {
        System.out.println(item + " <T> Generics Method! " + values);
    }


    public static void main(String[] args) {
        print(404, "Not Found!");
        print(403, "Unauto!");
    }
}
