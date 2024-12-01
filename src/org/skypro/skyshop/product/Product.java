package org.skypro.skyshop.product;

public class Product {
    private String name;
    private int cost;

    public Product(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Product c2 = (Product) other;
        return name.equals(c2.name);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(name);
    }

    @Override
    public String toString() {
        return name + ": " + cost;
    }
}