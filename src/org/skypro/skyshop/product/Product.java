package org.skypro.skyshop.product;

import org.skypro.skyshop.Search.Searchable;

public class Product implements Searchable { // родительский класс для продуктов разных цен
    private String name;

    public Product(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return 0;
    }

    public boolean isSpecial() {
        return false;
    }

    @Override
    public String gettingSearchTerm() {
        return "возвращать имя товара" + name;
    }

    @Override
    public String gettingContentType() {
        return "PRODUCT";
    }
}