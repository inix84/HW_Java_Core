import org.skypro.skyshop.basket.ProductBasket;

public class App {
    public static void main(String[] args) {
        ProductBasket Basket = new ProductBasket();
        Basket.addProduct("Молоко", 56);
        Basket.addProduct("Хлеб", 23);
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

    }
}