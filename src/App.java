import org.skypro.skyshop.Search.SearchEngine;
import org.skypro.skyshop.Search.Searchable;
import org.skypro.skyshop.article.Article;
import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.DiscountedProduct;
import org.skypro.skyshop.product.Product;
import org.skypro.skyshop.product.SimpleProduct;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        System.out.println("**** ДЗ ИНКАПСУЛЯЦИЯ, ДЗ НАСЛЕДОВАНИЕ **** ");
        ProductBasket Basket = new ProductBasket();
        Basket.addProduct("Молоко", 56); // обычное молоко
        Basket.addProduct("Молоко", 56, 40); // со скидкой
        Basket.addProduct("Молоко"); // с фикс.ценой
        Basket.addProduct("Хлеб", 23); // обычный хлеб
        Basket.addProduct("Хлеб", 23, 20); // со скидкой
        Basket.addProduct("Хлеб"); // с фиксированной ценой
        Basket.addProduct("Масло", 130);
        Basket.addProduct("Сметана", 78);
        Basket.addProduct("Сосиски", 202);

        Basket.addProduct("Чипсы", 249);

        Basket.printBasket();

        Basket.printTotalPriceBasket();

        Basket.findProduct("Масло");

        Basket.findProduct("Чипсы");

        Basket.cleaningBasket();

        Basket.printBasket();

        Basket.printTotalPriceBasket();

        Basket.findProduct("Масло");
        System.out.println("**** ТЕСТИРОВАНИЕ ИЗМЕНЕНИЙ. ДЗ ПОЛИМОРФИЗМ ****");
        //Создайте один объект типа SearchEngine
        SearchEngine SearchEngine = new SearchEngine(10);

        // Я ОТДЕЛЬНЫЕ СОЗДАЛА, А НЕ ТЕ ЧТО В КОРЗИНЕ!
        Product product1 = new Product("Масло");
        Product product2 = new Product("Молоко");
        Product product3 = new Product("Хлеб");

        //добавьте в него все товары, которые создаются для проверки других методов.
        SearchEngine.add(product1);
        SearchEngine.add(product2);
        SearchEngine.add(product3);

        //Создайте несколько объектов типа Article
        Article article1 = new Article("Масло", "о масле");
        Article article2 = new Article("Масло", "о молоке, которое стало масло");
        Article article3 = new Article("Хлеб", "о хлебе");

        // добавьте их в Search Engine
        SearchEngine.add(article1);
        SearchEngine.add(article2);
        SearchEngine.add(article3);

        product1.getStringRepresentation();
        product2.getStringRepresentation();
        product3.getStringRepresentation();
        article1.getStringRepresentation();
        article2.getStringRepresentation();
        article3.getStringRepresentation();

        // Продемонстрируйте функциональность поиска с помощью объекта SearchEngine: вызовите метод search несколько раз с разными строками поиска.
        SearchEngine.search("Масло");
        SearchEngine.search("Молоко");
        SearchEngine.search("Хлеб");

        System.out.println("**** ТЕСТИРОВАНИЕ ИЗМЕНЕНИЙ. ДЗ ИСКЛЮЧЕНИЯ ****");
        try {
            Product product4 = new Product(null);
        } catch (IllegalArgumentException e) {
            System.out.println("У добавляемого продукта нет названия , либо оно состоит только из пробелов. Продукт не создан");
        }
        try {
            Product product5 = new SimpleProduct("Молоко", -10);
        } catch (IllegalArgumentException e) {
            System.out.println("У добавляемого продукта отрицательная основная цена. Продукт не создан");
        }try {
            Product product6 = new DiscountedProduct("Мясная вырезка", 1000, 111);
        } catch (IllegalArgumentException e) {
            System.out.println("У добавляемого продукта процент скидки меньше 0%, либо больше 100%. Продукт не создан");
        }
    }
}