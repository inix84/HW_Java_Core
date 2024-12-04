package org.skypro.skyshop.product;

import java.util.Objects;

public class SimpleProduct extends Product {
    private int price;
    public SimpleProduct(String name, int price) {
        super(name);
        this.price = price;
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
