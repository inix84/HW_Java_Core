package org.skypro.skyshop.basket;

import org.skypro.skyshop.product.DiscountedProduct;
import org.skypro.skyshop.product.FixPriceProduct;
import org.skypro.skyshop.product.Product;
import org.skypro.skyshop.product.SimpleProduct;

public class ProductBasket {
    private Product[] basket;
    private int sizeBasket = 0;

    public ProductBasket() {
        this.basket = new Product[9]; // изменила +3 товара величину корзины
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

    public void addProduct(String name, int basicPrice, int discount) {
        if (sizeBasket <= basket.length - 1) {
            DiscountedProduct newProduct = new DiscountedProduct(name, basicPrice, discount);
            basket[sizeBasket] = newProduct;
            sizeBasket++;
        } else {
            System.out.println("Невозможно добавить продукт");
        }
    }

    public void addProduct(String productName) {
        if (sizeBasket <= basket.length - 1) {
            FixPriceProduct newProduct = new FixPriceProduct(productName);
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
            Product product = basket[i];
            summ = summ + product.getPrice();
        }
        System.out.println("Итого: " + summ);
    }

    public void printBasket() {
        if (sizeBasket != 0) {
            for (int i = 0; i < sizeBasket; i++) {
                Product product = basket[i];
                System.out.println(product.toString());
            }
        }
        if (sizeBasket == 0) {
            System.out.println("В корзине пусто ");
        }
    }
}
