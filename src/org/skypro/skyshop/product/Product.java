package org.skypro.skyshop.product;

import org.skypro.skyshop.Search.Searchable;

import java.util.Objects;

public class Product implements Searchable, Comparable<Searchable> { // родительский класс для продуктов разных цен

    private String name;

    public Product(String name) {
        this.name = name;
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("У продукта нет названия , либо оно состоит только из пробелов");
        }
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
        return name;
    }

    @Override
    public String getSearchTerm() {
        return name;
    }

    @Override
    public Integer getNameLength() {
        return gettingSearchTerm().length();
    }

    @Override
    public String gettingContentType() {
        return "PRODUCT";
    }

    @Override
    public void getStringRepresentation() {
        Searchable.super.getStringRepresentation();
    }

    @Override
    public String toString() {
        return "ПРОДУКТ: " + name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    @Override
    public int compareTo(Searchable o) {
        return this.getNameLength() - o.getNameLength();
    }
}