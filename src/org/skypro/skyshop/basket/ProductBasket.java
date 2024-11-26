package org.skypro.skyshop.basket;

import org.skypro.skyshop.product.Product;

public class ProductBasket {
    private Product[] basket;
    private int sizeBasket = 0;

    public ProductBasket() {
        this.basket = new Product[5];
    }

    public void addProduct(String productName, int productCost) {
        if (sizeBasket <= basket.length - 1) {
            Product newProduct = new Product(productName, productCost);
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
                System.out.println(productName + " в корзине есть");
                return true;
            }
        }
        System.out.println(productName + " в корзине нет");
        return false;
    }

    public void printTotalCostBasket() {
        int summ = 0;
        for (int i = 0; i < sizeBasket; i++) {
            Product product = basket[i];
            summ = summ + product.getCost();
        }
        System.out.println("Итого: " + summ);
    }

    public void printBasket() {
        if (sizeBasket != 0) {
            for (int i = 0; i < sizeBasket; i++) {
                Product product = basket[i];
                System.out.println(product.getName() + ": " + product.getCost());
            }
        }
        if (sizeBasket == 0) {
            System.out.println("В корзине пусто ");
        }
    }
}
