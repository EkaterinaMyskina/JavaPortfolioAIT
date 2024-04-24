package lesson20;
import java.util.ArrayList;
/*
1. Создание списка покупок:
a. Создайте класс Purchase с полями itemName (название товара) и price (цена товара).
b. Создайте метод main для инициализации ArrayList с покупками и заполните его несколькими товарами.
2. Добавление новых покупок:
a. Напишите метод для добавления новой покупки в список. Параметры метода: название товара и его цена.
b. Проверьте работу метода, добавив несколько новых покупок в список.
3. Вывод списка покупок:
a. Напишите метод для вывода всех покупок из списка.
b. Проверьте работу метода, вызвав его после добавления нескольких покупок.
4. Поиск покупок:
a. Напишите метод для поиска покупок по названию товара.
b. Проверьте работу метода, вызвав его для поиска нескольких товаров.
5. Удаление покупок:
a. Напишите метод для удаления покупки по её названию.
b. Проверьте работу метода, удалив одну из покупок и выведя список покупок снова.
 */

public class Purchase {
    private String itemName;
    private double price;

    // создаем конструктор
    public Purchase(String itemName, double price) {
        this.itemName = itemName;
        this.price = price;
    }

    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public static void addPurchase(ArrayList<Purchase> purchaseArrayList, String purchaseName, double purchasePrice) {
        purchaseArrayList.add(new Purchase(purchaseName, purchasePrice));
    }

    @Override
    public String toString() {
        return "Purchase{" +
                "itemName='" + itemName + '\'' +
                ", price='" + price + '\'' +
                '}';
    }

    public static void searchProductByName(ArrayList<Purchase> purchaseArrayList, String productName) {

        boolean isName = false;
        for (int i = 0; i < purchaseArrayList.size(); i++) {
            if (purchaseArrayList.get(i).equals(productName)) {
                purchaseArrayList.get(i);
                System.out.println("Найден продукт " + productName + " он находится под индексом " + i);
                isName = true;
            }
        }
            if (!isName) {
                System.out.println("Продукт " + productName + " не найден.");
            }

    }


    public static void deleteProductByName(ArrayList<Purchase> purchaseArrayList,String productName) {
        /*
        5. Удаление покупок:
a. Напишите метод для удаления покупки по её названию.
b. Проверьте работу метода, удалив одну из покупок и выведя список покупок снова.
         */

    }
}