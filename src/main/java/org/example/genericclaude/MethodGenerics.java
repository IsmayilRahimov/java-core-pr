package org.example.genericclaude;

public class MethodGenerics {

    public static <E> void show(E element) {
        System.out.println("Element: " + element);
    }

    public <T> void runing(T nums) {
        System.out.println("Nums: " + nums);
    }

    public static void main(String[] args) {
        MethodGenerics mg = new MethodGenerics();
        show('A'); // static
        mg.runing(404);
    }
}
