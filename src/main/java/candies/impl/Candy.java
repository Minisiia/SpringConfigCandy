package candies.impl;

import candies.interfaces.Product;

public class Candy implements Product {
    private String name;
    private String type;
    private String manufacturer;
    private int weight;
    private double price;

    public Candy() {
    }

    public Candy(String name, String type) {
        this.name = name;
        this.type = type;
    }


    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public void init() {
        manufacturer = "Roshen";
    }

    @Override
    public String toString() {
        return "Candy{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", weight=" + weight +
                ", price=" + price +
                '}';
    }
}
