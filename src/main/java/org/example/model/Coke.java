package org.example.model;

public class Coke extends ProductForSale{

    private String name;
    public Coke(String type, int price, String description) {
        super(type, price, description);
        this.name = name;
    }

    @Override
    public void showDetails() {
        System.out.println("Product: " + getType());
        System.out.println("Description: " + getDescription());
        System.out.println("Price: $" + getPrice());
        System.out.println("Name:" + name);
    }

}
