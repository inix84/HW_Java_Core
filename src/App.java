import org.skypro.skyshop.Search.SearchEngine;
import org.skypro.skyshop.Search.Searchable;
import org.skypro.skyshop.article.Article;
import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.Product;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
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
        System.out.println();
        Basket.addProduct("Чипсы", 249);
        System.out.println();
        Basket.printBasket();
        System.out.println();
        Basket.printTotalPriceBasket();
        System.out.println();
        Basket.findProduct("Масло");
        System.out.println();
        Basket.findProduct("Чипсы");
        System.out.println();
        Basket.cleaningBasket();
        System.out.println();
        Basket.printBasket();
        System.out.println();
        Basket.printTotalPriceBasket();
        System.out.println();
        Basket.findProduct("Масло");
        System.out.println("ТЕСТИРОВАНИЕ ИЗМЕНЕНИЙ");
        SearchEngine SearchEngine = new SearchEngine(10);
        Article article1 = new Article("Масло", "о масле");
        Article article2 = new Article("Масло", "о молоке, которое стало масло");
        Article article3 = new Article("Хлеб", "о хлебе");
        Product product1 = new Product("Масло");
        Product product2 = new Product("Молоко");
        Product product3 = new Product("Хлеб");

        product1.getStringRepresentation();
        product2.getStringRepresentation();
        product3.getStringRepresentation();
        article1.getStringRepresentation();
        article2.getStringRepresentation();
        article3.getStringRepresentation();

        SearchEngine.add(article1);
        SearchEngine.add(article2);
        SearchEngine.add(article3);
        SearchEngine.add(product1);
        SearchEngine.add(product2);
        SearchEngine.add(product3);

        SearchEngine.search("Масло");
        SearchEngine.search("Молоко");
        SearchEngine.search("Хлеб");
    }
}