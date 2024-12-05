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
    @Override
    public boolean isSpecial() {
        return true;
    }

    public int getDiscount() {
        return discount;
    }

    @Override
    public int getPrice() {
        float x = basicPrice * ((100 - discount) / 100);
        return (int) x;
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
        return getName() + ": " + getPrice() + "(" + getDiscount() + "%)";
    }
}
