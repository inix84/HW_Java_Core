package org.skypro.skyshop.product;

public class ProductBasket {
    private final Product[] products;
    private int size;

    public ProductBasket() {
        this.products = new Product[5];
    }

    public void addProduct(String productName, int cost) {
        if (size >= products.length) {
            System.out.println("Нельзя добавить продукт, закончилось место");
        }
        Product newProduct = new Product(productName, cost);
        products[size++] = newProduct;
    }

    public void removeProduct(String productName) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].getName().equals(productName)) {
                System.out.println(products[i].getName() + " удален");
                System.arraycopy(products, i + 1, products, i, size - i - 1);
                products[size - 1] = null;
                size--;
                return;
            }
        }
    }

    public void findProduct(String productName) {
        for (int i = 0; i < size; i++) {
            Product product = products[i];
            if (product.getName().equals(productName)) {
                System.out.println(product.getName() + " по " + product.getCost() + " рублей ");
                return;
            }
        }
        System.out.println(productName + " не найден");
    }

    public void printAllProducts() {
        for (int i = 0; i < size; i++) {
            Product product = products[i];
            System.out.println(product.getName() + " по " + product.getCost() + " рублей ");
        }
    }

    public int getCurrentSize() {
        return size;
    }
}