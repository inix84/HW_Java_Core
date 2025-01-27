import org.skypro.skyshop.Search.SearchEngine;
import org.skypro.skyshop.application.errors.BestResultNotFound;
import org.skypro.skyshop.article.Article;
import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.DiscountedProduct;
import org.skypro.skyshop.product.Product;
import org.skypro.skyshop.product.SimpleProduct;


public class App {
    public static void main(String[] args) {
        System.out.println("**** ДЗ ИНКАПСУЛЯЦИЯ, ДЗ НАСЛЕДОВАНИЕ **** ");
        ProductBasket Basket = new ProductBasket();
        Basket.addProduct("молоко", 56); // обычное молоко
        Basket.addProduct("молоко", 56, 40); // со скидкой
        Basket.addProduct("молоко"); // с фикс.ценой
        Basket.addProduct("хлеб", 23); // обычный хлеб
        Basket.addProduct("хлеб", 23, 20); // со скидкой
        Basket.addProduct("хлеб"); // с фиксированной ценой
        Basket.addProduct("масло", 130);
        Basket.addProduct("сметана", 78);
        Basket.addProduct("сосиски", 202);

        Basket.addProduct("чипсы", 249);

        Basket.printBasket();

        Basket.printTotalPriceBasket();

        Basket.findProduct("масло");

        Basket.findProduct("чипсы");

        Basket.cleaningBasket();

        Basket.printBasket();

        Basket.printTotalPriceBasket();

        Basket.findProduct("масло");
        System.out.println("**** ТЕСТИРОВАНИЕ ИЗМЕНЕНИЙ. ДЗ ПОЛИМОРФИЗМ ****");
        //Создайте один объект типа SearchEngine
        SearchEngine SearchEngine = new SearchEngine(100);

        // Я ОТДЕЛЬНЫЕ СОЗДАЛА, А НЕ ТЕ ЧТО В КОРЗИНЕ!
        Product product1 = new Product("масло");
        Product product2 = new Product("молоко");
        Product product3 = new Product("хлеб");

        //добавьте в него все товары, которые создаются для проверки других методов.
        SearchEngine.add(product1);
        SearchEngine.add(product2);
        SearchEngine.add(product3);

        //Создайте несколько объектов типа Article
        Article article1 = new Article("масло", "масло, масло, 87% жирности");
        Article article2 = new Article("масло", "65% жирности");
        Article article3 = new Article("хлеб", "хлеб натуральный, быстро плеснеевеет");

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
        SearchEngine.search("масло");
        SearchEngine.search("молоко");
        SearchEngine.search("хлеб");

        System.out.println("**** ТЕСТИРОВАНИЕ ИЗМЕНЕНИЙ. ДЗ ИСКЛЮЧЕНИЯ ****");
        try {
            Product product11 = new Product(null);
        } catch (IllegalArgumentException e) {
            System.out.println("У добавляемого продукта нет названия , либо оно состоит только из пробелов. Продукт не создан.");
        }
        try {
            Product product22 = new SimpleProduct("молоко", -10);
        } catch (IllegalArgumentException e) {
            System.out.println("У добавляемого продукта отрицательная основная цена. Продукт не создан.");
        }
        try {
            Product product33 = new DiscountedProduct("мясная вырезка", 1000, 111);
        } catch (IllegalArgumentException e) {
            System.out.println("У добавляемого продукта процент скидки меньше 0%, либо больше 100%. Продукт не создан.");
        }
        //добавляем больше элементов, для демонстрации поиска
        Product product4 = new Product("масло");
        Product product5 = new Product("молоко");
        Product product6 = new Product("хлеб");
        SearchEngine.add(product4);
        SearchEngine.add(product5);
        SearchEngine.add(product6);

        Article article4 = new Article("молоко", "самое вкусное");
        Article article5 = new Article("масло", "шоколадное масло-масло-масло-масло");
        Article article6 = new Article("хлеб", "бородинский хлеб");
        SearchEngine.add(article4);
        SearchEngine.add(article5);
        SearchEngine.add(article6);
        try {
        SearchEngine.searchSuitableElement("масло");
        } catch (BestResultNotFound e) {
            System.out.println(e.toString());
        }
        try {
            SearchEngine.searchSuitableElement("чипсы");
        } catch (BestResultNotFound e) {
            System.out.println(e.toString());
        }
    }
}