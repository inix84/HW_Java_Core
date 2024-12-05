package org.skypro.skyshop.product;

import java.util.Objects;

public class DiscountedProduct extends Product {// класс для продуктов со скидочной ценой
    private int basicPrice;// базовая цена
    private int discount;// скидка, целое число, %, от 0 до 100%

    public DiscountedProduct(String name, int basicPrice, int discount) {
        super(name);
        this.basicPrice = basicPrice;
        this.discount = discount;
    }

    public boolean isSpecial() {
        return true;
    }

    @Override
    public int getPrice() {
        return basicPrice * ((100 - discount) / 100);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DiscountedProduct that = (DiscountedProduct) o;
        return basicPrice == that.basicPrice && discount == that.discount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(basicPrice, discount);
    }

    @Override
    public String toString() {
        return getName() + ": " + getPrice() + "(" + discount + "%)";
    }
}
