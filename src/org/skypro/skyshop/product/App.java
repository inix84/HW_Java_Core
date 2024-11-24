package org.skypro.skyshop.product;

public class App {
    public static void main(String[] args) {
        ProductBasket productBasket = new ProductBasket();
        productBasket.addProduct("Молоко", 56);
        productBasket.addProduct("Хлеб", 23);
        productBasket.addProduct("Масло", 130);
        productBasket.addProduct("Сметана", 78);
        productBasket.addProduct("Сосиски", 202);
        productBasket.printAllProducts();
        System.out.println("Размер корзины: " + productBasket.getCurrentSize());
        System.out.println();
        productBasket.findProduct("Масло");
        System.out.println();
        productBasket.removeProduct("Масло");
        System.out.println();
        productBasket.findProduct("Масло");
        System.out.println();
        productBasket.printAllProducts();
        System.out.println("Размер корзины: " + productBasket.getCurrentSize());
    }
}