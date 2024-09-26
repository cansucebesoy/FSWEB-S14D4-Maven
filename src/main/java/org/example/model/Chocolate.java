package org.example.model;

public class Chocolate extends ProductForSale {

    private int brand;

    public Chocolate(String type, int price, String description) {
        super(type, price, description);
        this.brand=brand;
    }

    @Override
    public void showDetails() {
        System.out.println("Product: " + getType());
        System.out.println("Description: " + getDescription());
        System.out.println("Price: $" + getPrice());
        System.out.println("Brand: " + brand);

    }
}
