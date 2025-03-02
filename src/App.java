import org.skypro.skyshop.Search.SearchEngine;
import org.skypro.skyshop.application.errors.BestResultNotFound;
import org.skypro.skyshop.article.Article;
import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.DiscountedProduct;
import org.skypro.skyshop.product.Product;
import org.skypro.skyshop.product.SimpleProduct;

public class App {
    public static void main(String[] args) {
//        System.out.println(
//                "                                                      ****  ДЗ ИНКАПСУЛЯЦИЯ, ДЗ НАСЛЕДОВАНИЕ **** ");
//        ProductBasket Basket = new ProductBasket();
//        Basket.addProduct("молоко", 56); // обычное молоко
//        Basket.addProduct("молоко", 56, 40); // со скидкой
//        Basket.addProduct("молоко"); // с фикс.ценой
//        Basket.addProduct("хлеб", 23); // обычный хлеб
//        Basket.addProduct("хлеб", 23, 20); // со скидкой
//        Basket.addProduct("хлеб"); // с фиксированной ценой
//        Basket.addProduct("масло", 130);
//        Basket.addProduct("сметана", 78);
//        Basket.addProduct("сосиски", 202);
//        Basket.addProduct("чипсы", 249);
//
//        Basket.printBasket();
//
//        Basket.printTotalPriceBasket();
//
//        Basket.findProduct("каша");
//        Basket.findProduct("чипсы");
//
//        Basket.cleaningBasket();
//
//        Basket.printBasket();
//
//        Basket.printTotalPriceBasket();
//
//        Basket.findProduct("масло");
//        System.out.println(
//                "                                          **** ТЕСТИРОВАНИЕ ИЗМЕНЕНИЙ. ДЗ 2, 3, 4 ПОЛИМОРФИЗМ ****");
//        //Создайте один объект типа SearchEngine
//        SearchEngine SearchEngine = new SearchEngine();
//
//        // Я ОТДЕЛЬНЫЕ СОЗДАЛА, А НЕ ТЕ ЧТО В КОРЗИНЕ!
//        Product product1 = new Product("масло");
//        Product product2 = new Product("молоко");
//        Product product3 = new Product("хлеб");
//
//        //добавьте в него все товары, которые создаются для проверки других методов.
//        SearchEngine.add(product1);
//        SearchEngine.add(product2);
//        SearchEngine.add(product3);
//
//        //Создайте несколько объектов типа Article
//        Article article1 = new Article("масло", "масло, масло, 87% жирности");
//        Article article2 = new Article("масло", "65% жирности");
//        Article article3 = new Article("хлеб", "хлеб натуральный, быстро плеснеевеет");
//
//        // добавьте их в Search Engine
//        SearchEngine.add(article1);
//        SearchEngine.add(article2);
//        SearchEngine.add(article3);
//
//        product1.getStringRepresentation();
//        product2.getStringRepresentation();
//        product3.getStringRepresentation();
//        article1.getStringRepresentation();
//        article2.getStringRepresentation();
//        article3.getStringRepresentation();
//
//        // Продемонстрируйте функциональность поиска с помощью объекта SearchEngine: вызовите метод search несколько раз с разными строками поиска.
//        SearchEngine.search("масло");
//        SearchEngine.search("молоко");
//        SearchEngine.search("хлеб");
//
//        System.out.println(
//                "                                                 **** ТЕСТИРОВАНИЕ ИЗМЕНЕНИЙ. ДЗ 5 ИСКЛЮЧЕНИЯ ****");
//        try {
//            Product product11 = new Product(null);
//        } catch (IllegalArgumentException e) {
//            System.out.println("У добавляемого продукта нет названия , либо оно состоит только из пробелов. Продукт не создан.");
//        }
//        try {
//            Product product22 = new SimpleProduct("молоко", -10);
//        } catch (IllegalArgumentException e) {
//            System.out.println("У добавляемого продукта отрицательная основная цена. Продукт не создан.");
//        }
//        try {
//            Product product33 = new DiscountedProduct("мясная вырезка", 1000, 111);
//        } catch (IllegalArgumentException e) {
//            System.out.println("У добавляемого продукта процент скидки меньше 0%, либо больше 100%. Продукт не создан.");
//        }
//        //добавляем больше элементов, для демонстрации поиска
//        Product product4 = new Product("масло");
//        Product product5 = new Product("молоко");
//        Product product6 = new Product("хлеб");
//        SearchEngine.add(product4);
//        SearchEngine.add(product5);
//        SearchEngine.add(product6);
//
//        Article article4 = new Article("молоко", "самое вкусное");
//        Article article5 = new Article("масло", "шоколадное масло-масло-масло-масло");
//        Article article6 = new Article("хлеб", "бородинский хлеб");
//        SearchEngine.add(article4);
//        SearchEngine.add(article5);
//        SearchEngine.add(article6);
//        try {
//            SearchEngine.searchSuitableElement("масло");
//        } catch (BestResultNotFound e) {
//            System.out.println(e.toString());
//        }
//        try {
//            SearchEngine.searchSuitableElement("чипсы");
//        } catch (BestResultNotFound e) {
//            System.out.println(e.toString());
//        }
//        System.out.println(
//                "                                                      **** ТЕСТИРОВАНИЕ ИЗМЕНЕНИЙ. ДЗ 6 ЛИСТЫ ****");
//        // скопировала с прошлой корзины
//        Basket.addProduct("молоко", 56); // обычное молоко
//        Basket.addProduct("молоко", 56, 40); // со скидкой
//        Basket.addProduct("молоко"); // с фикс.ценой
//        Basket.addProduct("хлеб", 23); // обычный хлеб
//        Basket.addProduct("хлеб", 23, 20); // со скидкой
//        Basket.addProduct("хлеб"); // с фиксированной ценой
//        Basket.addProduct("масло", 130);
//        Basket.addProduct("сметана", 78);
//        Basket.addProduct("сосиски", 202);
//        Basket.addProduct("чипсы", 249);
//
//        Basket.printBasket();
//        Basket.RemovingProductBasket("молоко");
//        Basket.RemovingProductBasket("каша");
//        Basket.printBasket();
//
//        SearchEngine SearchEngineList = new SearchEngine(); // создала новый лист SearchEngineList
//
//        Product product7 = new Product("масло"); // создала новые продукты и статьи
//        Product product8 = new Product("молоко");
//        Product product9 = new Product("хлеб");
//        Article article7 = new Article("масло", "масло, масло, 87% жирности");
//        Article article8 = new Article("масло", "65% жирности");
//        Article article9 = new Article("хлеб", "хлеб натуральный, быстро плесневеет");
//
//        SearchEngineList.add(product7); // добавила их в новый SearchEngineList
//        SearchEngineList.add(product8);
//        SearchEngineList.add(product9);
//        SearchEngineList.add(article7);
//        SearchEngineList.add(article8);
//        SearchEngineList.add(article9);
//
//        SearchEngineList.search("масло"); // просто поиск в SearchEngineList
//        SearchEngineList.search("молоко");
//        SearchEngineList.search("хлеб");
//
//        try {
//            SearchEngineList.searchSuitableElement("масло"); // самый подходящий в SearchEngineList
//        } catch (BestResultNotFound e) {
//            System.out.println(e.toString());
//        }
//        try {
//            SearchEngineList.searchSuitableElement("чипсы");
//        } catch (BestResultNotFound e) {
//            System.out.println(e.toString());
//        }
//        System.out.println(
//                "                                                                             **** ДЗ КАРТЫ 7 **** ");
//
//        System.out.println(
//                "                                                 **** Демонстрация корзины и всех ее методов **** ");
//
//        ProductBasket Basket3 = new ProductBasket();
//        Basket3.addProduct("молоко", 56); // обычное молоко
//        Basket3.addProduct("молоко", 56, 40); // со скидкой
//        Basket3.addProduct("молоко"); // с фикс.ценой
//
//        Basket3.addProduct("хлеб", 23); // обычный хлеб
//        Basket3.addProduct("хлеб", 453); // обычный хлеб
//        Basket3.addProduct("хлеб", 23, 20); // со скидкой
//        Basket3.addProduct("хлеб"); // с фиксированной ценой
//
//        Basket3.addProduct("масло", 130);
//        Basket3.addProduct("сметана", 78);
//        Basket3.addProduct("сосиски", 202);
//        Basket3.addProduct("чипсы", 249);
//        Basket3.printTotalPriceBasket();
//        Basket3.printBasket();
//
//        Basket3.RemovingProductBasket("молоко");
//        Basket3.RemovingProductBasket("каша");
//        Basket3.printBasket();
//
//        Basket3.findProduct("каша");
//        Basket3.findProduct("хлеб");
//
//        Basket3.cleaningBasket();
//        Basket3.printBasket();
//        Basket3.printTotalPriceBasket();
//
//        System.out.println(
//                "                                                         **** Демонстрация поискового движка **** ");
//
//        SearchEngine SearchEngine3 = new SearchEngine();
//
//        Product product31 = new Product("масло");
//        Product product32 = new Product("молоко");
//        Product product33 = new Product("хлеб");
//
//        SearchEngine3.add(product31);
//        SearchEngine3.add(product32);
//        SearchEngine3.add(product33);
//
//        Article article31 = new Article("масло", "масло, масло, 87% жирности");
//        Article article32 = new Article("масло", "65% жирности");
//        Article article33 = new Article("хлеб", "хлеб натуральный, быстро плеснеевеет");
//
//        SearchEngine3.add(article31);
//        SearchEngine3.add(article32);
//        SearchEngine3.add(article33);
//
//        product31.getStringRepresentation();
//        product32.getStringRepresentation();
//        product33.getStringRepresentation();
//        article31.getStringRepresentation();
//        article32.getStringRepresentation();
//        article33.getStringRepresentation();
//
//
//        SearchEngine3.search("масло");
//        SearchEngine3.search("молоко");
//        SearchEngine3.search("хлеб");
//
//        try {
//            SearchEngine3.searchSuitableElement("масло");
//        } catch (BestResultNotFound e) {
//            System.out.println(e.toString());
//        }
//        try {
//            SearchEngine3.searchSuitableElement("чипсы");
//        } catch (BestResultNotFound e) {
//            System.out.println(e.toString());
//        }

        System.out.println(
                "                                                                         ****  ДЗ 8 МНОЖЕСТВА  **** ");

        System.out.println(
                "                                                                ****  Демонстрация Задание 1.  **** ");
        SearchEngine SearchEngine4 = new SearchEngine();

        Product product41 = new Product("масло");
        Product product42 = new Product("молоко");
        Product product43 = new Product("хлеб");

        SearchEngine4.add(product41);
        SearchEngine4.add(product42);
        SearchEngine4.add(product43);

        Article article41 = new Article("масло", "масло, масло, 87% жирности");
        Article article42 = new Article("масло", "65% жирности"); // не вносит в множество
        Article article43 = new Article("хлеб", "хлеб натуральный, быстро плесневеет");

        SearchEngine4.add(article41);
        SearchEngine4.add(article42);
        SearchEngine4.add(article43);

        System.out.println(SearchEngine4);
        System.out.println(
                "                                                                ****  Демонстрация Задание 2.  **** ");

        SearchEngine4.search("масло");
        SearchEngine4.search("молоко");
        SearchEngine4.search("хлеб");

//        try {
//            SearchEngine4.searchSuitableElement("масло");
//        } catch (BestResultNotFound e) {
//            System.out.println(e.toString());
//        }
//        try {
//            SearchEngine4.searchSuitableElement("чипсы");
//        } catch (BestResultNotFound e) {
//            System.out.println(e.toString());
//        }


    }
}