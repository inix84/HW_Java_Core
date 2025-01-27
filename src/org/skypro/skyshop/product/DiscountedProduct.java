package org.skypro.skyshop.product;

import java.util.Objects;

public class DiscountedProduct extends Product {// класс для продуктов со скидочной ценой
    private int basicPrice;// базовая цена
    private int discount;// скидка, целое число, %, от 0 до 100%

    public DiscountedProduct(String name, int basicPrice, int discount) {
        super(name);
        this.basicPrice = basicPrice;
        this.discount = discount;

        if (basicPrice<=0) {
            throw new IllegalArgumentException("Отрицательная базовая цена ");
        }
        if (discount<=0 | discount>=100) {
            throw new IllegalArgumentException("Скидка меньше 0%, либо больше 100%");
        }
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
        int discount1 = 100 - discount;
        float discount2 = (float) discount1 / 100;
        float x = basicPrice * discount2;
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
