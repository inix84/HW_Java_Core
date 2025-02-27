package org.skypro.skyshop.basket;

import org.skypro.skyshop.product.DiscountedProduct;
import org.skypro.skyshop.product.FixPriceProduct;
import org.skypro.skyshop.product.Product;
import org.skypro.skyshop.product.SimpleProduct;

import java.util.*;


public class ProductBasket {
    private Map<String, List<Product>> basket; //поменяла структуру на Map

    public ProductBasket() {
        this.basket = new HashMap(); // поменяла конструктор
    }

    //добавление товара
    public void addProduct(String productName, int productPrice) { // слово, будущее название продукта + его будущая цена инт
        SimpleProduct newProduct = new SimpleProduct(productName, productPrice); //создание нового "продукта с основной ценой"
        // теперь нужно распределить в нужный список с одинаковым ключом, либо создать если такого ключа нет
        List productList = basket.computeIfAbsent(productName, k -> new ArrayList<>());
        productList.add(newProduct); // добавление созданного продукта в этот список
        basket.put(productName, productList);// кладем в корзину имя продукта как ключ, а сам продукт этот список с уже добавленным проуктом в целом
    }

    public void addProduct(String productName, int basicPrice, int discount) {
        DiscountedProduct newProduct = new DiscountedProduct(productName, basicPrice, discount);
        List productList = basket.computeIfAbsent(productName, k -> new ArrayList<>());
        productList.add(newProduct);
        basket.put(productName, productList);
    }

    public void addProduct(String productName) {
        FixPriceProduct newProduct = new FixPriceProduct(productName);
        List productList = basket.computeIfAbsent(productName, k -> new ArrayList<>());
        productList.add(newProduct);
        basket.put(productName, productList);
    }

    public void cleaningBasket() { // очистка корзины
        basket.clear();

        System.out.println("произошла очистка корзины!");
    }

    // поиск товара по имени
    public boolean findProduct(String productName) {
        for (List<Product> productList : basket.values()) {
            for (Product product : productList) {
                if (product.getName().equals(productName)) {
                    System.out.println("Искомый продукт " + productName + " найден.");
                    return true;
                }
            }
        }
        System.out.println("Искомый продукт " + productName + " не найден.");
        return false;
    }

    // удаление товара
    public List RemovingProductBasket(String productName) {
        List<Product> deletList = new ArrayList<>(); // лист для удаленных продуктов
        if (basket.containsKey(productName)) { // если такой ключ есть в корзине
            // перебираем все значения мапы, все продукты там содержащиеся,
            for (List<Product> productList : basket.values()) {
                for (Product product : productList) {
                    //и все добавляем в список удаленных продуктов, если имена совпадают
                    if (product.getName().equals(productName)) {
                        deletList.add(product);
                    }
                }
            }
            basket.remove(productName); // удаляем

        }
        if (deletList.isEmpty()) { // если пуст
            System.out.println("Ничего не было удалено из корзины по запросу /" + productName + "/. Список удаленных продуктов пуст.");
        } else {
            System.out.println("Удаленные продукты по запросу /" + productName + "/: " + deletList);
        }
        return deletList;
    }

    // счет спец товаров
    public void printTotalPriceBasket() {
        int summ = 0;
        int Special = 0;
        for (List<Product> productList : basket.values()) {
            for (Product product : productList) {
                summ = summ + product.getPrice();
                if (product.isSpecial()) {
                    Special++;
                }
            }
        }
        System.out.println("Общая сумма корзины и количество спец.товаров: ");
        System.out.println("Итого: " + summ);
        System.out.println("Специальных товаров: " + Special);
    }

    // распечатка корзины
    public void printBasket() {
        System.out.println("В корзине лежат: " + basket);
        if (basket.size() == 0) {
            System.out.println("В корзине пусто ");
        }
    }

}
