package homework06;

import java.util.Scanner;

public class Homework06d {
    /*
4. Комбинированный налог: Создайте программу для расчёта налога, который зависит от категории товара
и региона покупателя. Налог на электронику 10%, на одежду 5%. Если покупатель из региона A, применяется дополнительный налог 2%.
     */

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите категорию товара.");
        System.out.println("Для выбора категории Электроники нажмите 1 ");
        System.out.println("Для выбора категории Одежда нажмите 2: ");
        int categoryProduct = scanner.nextInt();
        System.out.println("Введите регион покупателя. Регион A - нажмите 1. Регион B - нажмите 2: ");
        int regionCustomer = scanner.nextInt();

        int taxElectronicGoods = 10;
        int taxClothes = 5;
        int taxAddition = 2;

        if (categoryProduct !=1 && categoryProduct!=2 && regionCustomer!=1 && regionCustomer !=2) {
            System.out.println("Вы не подчиняетесь нашей юрисдикции и ваш налог составит: 0%");
        }
        if (categoryProduct == 1) {
            if (regionCustomer == 1)
                System.out.println("Ваш налог составит: " + (taxElectronicGoods + taxAddition) + "%");
                else{
                System.out.println("Ваш налог составит: " + taxElectronicGoods + "%");
            }
        }
        if (categoryProduct == 2) {
            if (regionCustomer == 1)
                System.out.println("Ваш налог составит: " + (taxClothes + taxAddition) + "%");
            else{
                System.out.println("Ваш налог составит: " + taxClothes + "%");
            }
        }
        scanner.close();

        }
}
