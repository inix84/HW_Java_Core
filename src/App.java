import org.skypro.skyshop.Search.SearchEngine;
import org.skypro.skyshop.Search.Searchable;
import org.skypro.skyshop.article.Article;
import org.skypro.skyshop.basket.ProductBasket;

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
        Article Article1 = new Article("Масло", "о масле");
        Article Article2 = new Article("Масло", "о молоке, которое стало масло");
        Article Article3 = new Article("Хлеб", "о хлебе");
        SearchEngine.add(Article1);
        SearchEngine.add(Article2);
        SearchEngine.add(Article3);
        //System.out.println(Article1);
        //SearchEngine.add();
        SearchEngine.search("Масло");
        SearchEngine.search("Молоко");
        SearchEngine.search("Хлеб");
    }
}