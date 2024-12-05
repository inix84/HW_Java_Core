package org.skypro.skyshop.product;

import java.util.Objects;

public class SimpleProduct extends Product {//класс для продуктов с обычной ценой
    private int price;

    public SimpleProduct(String name, int price) {
        super(name);
        this.price = price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isSpecial() {
        return false;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SimpleProduct that = (SimpleProduct) o;
        return price == that.price;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(price);
    }

    @Override
    public String toString() {
        return getName() + ": " + price;
    }
}
