package org.skypro.skyshop.basket;

import org.skypro.skyshop.product.DiscountedProduct;
import org.skypro.skyshop.product.FixPriceProduct;
import org.skypro.skyshop.product.Product;
import org.skypro.skyshop.product.SimpleProduct;

import java.awt.*;
import java.util.ArrayList;
import java.util.Iterator;

public class ProductBasket {
    private ArrayList basket; //поменяла структуру на ArrayList
    private int sizeBasket = 0;

    public ProductBasket() {
        this.basket = new ArrayList<>(); // поменяла конструктор
    }

    public void addProduct(String productName, int productPrice) {
// условия убрала
        SimpleProduct newProduct = new SimpleProduct(productName, productPrice);
        basket.add(newProduct); // методо добавления продукта в корзину-лист
        sizeBasket++; // по прежнему считает созданные продукты
    } // иначе вывод "Невозможно добавить продукт"убрала

    public void addProduct(String name, int basicPrice, int discount) {

        DiscountedProduct newProduct = new DiscountedProduct(name, basicPrice, discount);
        basket.add(newProduct);
        sizeBasket++;
    }

    public void addProduct(String productName) {

        FixPriceProduct newProduct = new FixPriceProduct(productName);
        basket.add(newProduct);
        sizeBasket++;
    }

    public void cleaningBasket() { // очистка корзины
        basket.clear();
        sizeBasket = 0;
    }


    public boolean findProduct(String productName) {

        Iterator iterator = basket.iterator();
        while (iterator.hasNext()) {
            //Product element = (Product) iterator.next();
        }
        if (iterator.next().equals(productName)) {
            return true;

        }
        return false;
    }

    public void printTotalPriceBasket() {
        int summ = 0;
        int Special = 0;
        for (int i = 0; i < sizeBasket; i++) {
            Product product = (Product) basket.get(i);
            summ = summ + product.getPrice();
            if (product.isSpecial()) {
                Special = Special + 1;
            }
        }
        System.out.println("Итого: " + summ);
        System.out.println("Специальных товаров: " + Special);
    }

    public void printBasket() {
        if (sizeBasket != 0) {
            Iterator iterator = basket.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
        }
        if (sizeBasket == 0) {
            System.out.println("В корзине пусто ");
        }
    }
}