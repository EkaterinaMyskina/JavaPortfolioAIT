package lesson20HW;

import java.util.ArrayList;
import lesson20.Purchase;

public class TestPurchaseHW {
    public static void main(String[] args) {

        ArrayList<PurchaseHW> goods = new ArrayList<>();
        PurchaseHW purchaseOne = new PurchaseHW("Ananas", 5); // создали первый объект класса
        PurchaseHW purchaseTwo = new PurchaseHW("Kiwi", 3); // создали второй объект класса

        goods.add(purchaseOne);
        goods.add(purchaseTwo);

        /* Напишите метод добавляющий новый продукт  */
        PurchaseHW.addPurchaseInList(goods, "Mango", 4); //  добавили новую покупку в список
        PurchaseHW.addPurchaseInList(goods, "Kartofeln", 2.5); // добавили новую покупку в список
        PurchaseHW.addPurchaseInList(goods, "Citrone", 5); // добавили новую покупку в список

        /* вывести на экран список всех продуктов */
        PurchaseHW.printPurchase(goods); // выводим лист на экран
        PurchaseHW.searchPurchase(goods, "Kiwi"); // ищем Kiwi в нашем листе
        PurchaseHW.cleanPurchase(goods, "Mango"); // ищем и удаляем Mango в нашем листе
        PurchaseHW.printPurchase(goods); // повторно выводим лист на экран
    }
}