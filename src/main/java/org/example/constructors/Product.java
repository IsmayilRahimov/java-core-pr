package org.example.constructors;

public class Product {
    public String name;
    public String category;
    public double price;
    public int productNo;
    public int stock;

    public Product(String name, String category, double price, int productNo, int stock) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.productNo = productNo;
        this.stock = stock;
    }
}
