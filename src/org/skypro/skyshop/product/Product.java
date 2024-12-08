package org.skypro.skyshop.product;

public abstract class Product { // родительский класс для продуктов разных цен
    private String name;

    public Product(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract int getPrice();

    public abstract boolean isSpecial();
}