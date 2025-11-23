package org.example.genericclaude;

public class ArryasAndGenerics {

    public static <E> void showMassiv(E[] massiv) {
        for (E element : massiv) {
            System.out.println(element + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        Integer[] numbers = {1, 4, 5, 6, 7};
        showMassiv(numbers);
        String[] names = {"Samir", "Cavid", "Eli", "Mustafa"};
        showMassiv(names);
    }
}
