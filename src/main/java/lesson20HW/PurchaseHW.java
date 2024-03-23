package lesson20HW;


import java.util.ArrayList;

// создаем класс где будут созданы объекты покупки
public class PurchaseHW {

    private String itemName;
    private double price;

    public PurchaseHW(String itemName, double price) {
        this.itemName = itemName;
        this.price = price;
    }

    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // static позволяет вызвать метод класса. Без static этот метод можно вызвать только у объекта класса.
    public static void addPurchaseInList(ArrayList<PurchaseHW> purchaseArrayList, String name, double price) {
        purchaseArrayList.add(new PurchaseHW(name, price));
    }

    /*  @Override
    public String toString() {
        return "PurchaseHW{" +
                "itemName='" + itemName + '\'' +
                ", price=" + price +
                '}';
    } */

    public static void printPurchase(ArrayList<PurchaseHW> list) {
        for (PurchaseHW good : list) {
            System.out.println(good.getItemName() + " " + good.getPrice());
        }
    }

    /*    4. Поиск покупок:
a. Напишите метод для поиска покупок по названию товара.
b. Проверьте работу метода, вызвав его для поиска нескольких товаров.     */
    public static void searchPurchase(ArrayList<PurchaseHW> list, String name) {
        boolean isName = false;
        for (int i = 0; i < list.size(); i++) {
            if (name.equals(list.get(i).getItemName())) { // Сравниваем входящее имя
                //с: 1. объектами. Вытаскиваем коробку под индексом i и потом из коробки вытаскивеем имя для сравнения.
                System.out.println("Покупка " + name + " найдена. ");
                isName = true;
            }
        }
        if (!isName) {
            System.out.println("Покупка " + name + " не найдена!");
        }
    }

    /* 5. Удаление покупок:
a. Напишите метод для удаления покупки по её названию.
b. Проверьте работу метода, удалив одну из покупок и выведя список покупок снова.  */
    public static void cleanPurchase(ArrayList<PurchaseHW> list, String name) {
        boolean isName = false;
        for (int i = 0; i < list.size(); i++) {
            if (name.equals(list.get(i).getItemName())) { // Удаляем запись со входящим именем
                //с: 1. объектами. Вытаскиваем коробку под индексом i и потом из коробки вытаскивеем имя для удаления
                list.remove(i);
                System.out.println("Мы удалили " + name + ".");
                isName = true;
            }
        }
        if (!isName) {
            System.out.println("Покупка " + name + " не найдено!");
        }
    }
}

