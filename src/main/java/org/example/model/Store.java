package org.example.model;

public class Store {
    public static void main(String[] args) {

        Chocolate chocolate = new Chocolate("fgdd", 5, "gffggf");
        Bread bread = new Bread("gfgf", 4, "jkj");
        Coke coke = new Coke("gfffggf", 9, "gfgfg");

        ProductForSale[] products = {chocolate, coke, bread};
        //listProducts();

        listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {
        for (ProductForSale product : products) {
            product.showDetails();
        }
    }
}