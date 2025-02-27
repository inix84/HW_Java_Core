package org.skypro.skyshop.basket;

import org.skypro.skyshop.product.DiscountedProduct;
import org.skypro.skyshop.product.FixPriceProduct;
import org.skypro.skyshop.product.Product;
import org.skypro.skyshop.product.SimpleProduct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class ProductBasket {
    private List basket; //поменяла структуру на ArrayList
    private int sizeBasket = 0;

    public ProductBasket() {
        this.basket = new ArrayList<>(); // поменяла конструктор
    }

    public void addProduct(String productName, int productPrice) {
// условия убрала
        SimpleProduct newProduct = new SimpleProduct(productName, productPrice);
        basket.add(newProduct); // методо добавления продукта в корзину-лист
        sizeBasket++; // по прежнему считает созданные продукты
    } // "Невозможно добавить продукт"убрала

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
        System.out.println("произошла очистка корзины!");
    }

    public boolean findProduct(String productName) {
        Iterator<Product> iterator = basket.iterator();
        while (iterator.hasNext()) { // пока есть след/элемент в списке
            Product element = iterator.next();
            if (element.getName().equals(productName)) { // если след.элемент его поле гет найм совпадает с передаваемым на поиск
                System.out.println("искомый продукт " + productName + " найден");
                return true;
            }
        }
        System.out.println("искомый продукт " + productName + " не найден");
        return false;
    }

    public List RemovingProductBasket(String productName) { // удаление продукты из корзины
        List<Product> deletList = new ArrayList<>(); // лист для удаленных продуктов
        Iterator<Product> iterator = basket.iterator(); // получние итератора из списка Корзины
        while (iterator.hasNext()) { // пока есть след.в списке Корзины
            Product element = iterator.next(); // элемент Корзины
            if (element.getName().equals(productName)) { // если совпадение по имени нашлось
                deletList.add(element); // добавляем это имя в дел-список
                iterator.remove(); //Строчка iterator.remove() в Java удаляет последний элемент, который был возвращён итератором.
                // Этот метод является необязательным и может быть вызван только один раз после вызова next().
                // basket.remove(element); (удаляем из списка Корзины) заменила на iterator.remove();
            }
        }
        if (deletList.isEmpty()) {
            System.out.println("Ничего не было удалено из корзины. Список удаленных продуктов пуст.");
        } else {
            System.out.println("Удаленные продукты: " + deletList);
        }
        return deletList;
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
        System.out.println("Общая сумма корзины и количество спец.товаров: ");
        System.out.println("Итого: " + summ);
        System.out.println("Специальных товаров: " + Special);
    }

    public void printBasket() {
        if (sizeBasket != 0) {
            System.out.println("В корзине лежат: ");
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
