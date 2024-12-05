package org.skypro.skyshop.basket;

import org.skypro.skyshop.product.SimpleProduct;

public class ProductBasket {
    private SimpleProduct[] basket;
    private int sizeBasket = 0;

    public ProductBasket() {
        this.basket = new SimpleProduct[5];
    }

    public void addProduct(String productName, int productPrice) {
        if (sizeBasket <= basket.length - 1) {
            SimpleProduct newProduct = new SimpleProduct(productName, productPrice);
            basket[sizeBasket] = newProduct;
            sizeBasket++;
        } else {
            System.out.println("Невозможно добавить продукт");
        }
    }

    public void cleaningBasket() {
        for (int i = 0; i < basket.length; i++) {
            basket[i] = null;
            sizeBasket = 0;
            return;
        }
    }

    public boolean findProduct(String productName) {
        for (int i = 0; i < sizeBasket; i++) {
            if (basket[i].getName().equals(productName)) {
                return true;
            }
        }
        return false;
    }

    public void printTotalPriceBasket() {
        int summ = 0;
        for (int i = 0; i < sizeBasket; i++) {
            SimpleProduct product = basket[i];
            summ = summ + product.getPrice();
        }
        System.out.println("Итого: " + summ);
    }

    public void printBasket() {
        if (sizeBasket != 0) {
            for (int i = 0; i < sizeBasket; i++) {
                SimpleProduct product = basket[i];
                System.out.println(product.getName() + ": " + product.getPrice());
            }
        }
        if (sizeBasket == 0) {
            System.out.println("В корзине пусто ");
        }
    }
}
