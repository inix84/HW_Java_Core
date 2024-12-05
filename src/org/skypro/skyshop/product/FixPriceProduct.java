package org.skypro.skyshop.product;

public class FixPriceProduct extends Product {// класс для продуктов со фиксированной ценой
    private static final int FIX_PRICE = 210;

    public FixPriceProduct(String name) {
        super(name);
    }
    @Override
    public boolean isSpecial() {
        return true;
    }

    @Override
    public int getPrice() {
        return FIX_PRICE; // некоторая фиксированная цена
    }

    @Override
    public String toString() {
        return getName() + ": фиксированная цена " + getPrice();
    }
}
