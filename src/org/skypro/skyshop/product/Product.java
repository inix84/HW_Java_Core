package org.skypro.skyshop.product;

import org.skypro.skyshop.Searchable;

public class Product implements Searchable { // родительский класс для продуктов разных цен
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

    @Override
    public String gettingSearchTerm() {
        return "возвращать имя товара"+name;
    }

    @Override
    public String gettingContentType() {
        return "PRODUCT";
    }
}