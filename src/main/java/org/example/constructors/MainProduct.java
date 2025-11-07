package org.example.constructors;

public class MainProduct {

    public static void main(String[] args) {
        Product product = new Product("Tsh-1", "Gaming NootBook", 2.500, 1, 100);
        ProductUsed productUsed = new ProductUsed(product);

        productUsed.add();
        productUsed.delete();

    }
}
