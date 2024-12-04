package org.skypro.skyshop.product;

public abstract class Product {
    private String name;
    //private int price;

    public Product(String name) {
        this.name = name;
        //this.price = price;
    }

    public String getName() {
        return name;
    }

    public abstract int getPrice();

    //public void setPrice(int price) {
    //    this.price = price;
    //}

    //public void setName(String name) {
    //    this.name = name;
    //}

    /*@Override
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
        return name + ": " + price;*/
    //}
}