/*package homework25;
/*
/*Давайте создадим упражнение по теме использования перечислений (enum) в Java, которое поможет улучшить понимание этой концепции.
Задание: "Кафе меню" Описание задачи

В вашем виртуальном кафе есть меню, включающее разные типы напитков и блюд.
Ваша задача — создать перечисление MenuItemType, которое будет определять типы
элементов меню (например, напиток или блюдо). Затем создайте класс MenuItem,
который использует это перечисление для определения типа каждого элемента меню.

       Шаги выполнения
Определите перечисление MenuItemType: DRINK для напитков. DISH для блюд.

Создайте класс MenuItem:
Добавьте поле name типа String для названия элемента.
Добавьте поле type типа MenuItemType для указания типа элемента.
        Создайте конструктор, принимающий оба значения.
Реализуйте методы getName() и getType() для доступа к полям.
Переопределите метод toString() для вывода информации об элементе.

Тестирование:
Создайте несколько объектов MenuItem, например, кофе (тип DRINK) и пиццу (тип DISH).
Выведите информацию о каждом объекте, используя System.out.println.

        Упражнение: Управление состояниями заказа

Задача: Создать перечисление OrderStatus, которое будет использоваться для отслеживания статуса заказа в интернет-магазине.

        Шаги:

Определите enum:
Создайте enum с именем OrderStatus.
Добавьте в него следующие статусы: PENDING, PROCESSING, SHIPPED, DELIVERED, CANCELLED.

Добавьте методы в enum:
Внутри enum создайте метод getDescription(), который возвращает строку, описывающую
каждый из статусов. Например, для PENDING метод может возвращать "Order is pending approval".

Тестирование enum:
В методе main создайте переменную типа OrderStatus и присвойте ей одно из значений.
Выведите на экран описание текущего статуса заказа.

Задача для дополнительной практики:

Расширьте перечисление OrderStatus, добавив метод canCancel(), который будет возвращать true для статусов,
когда заказ еще может быть отменен (PENDING, PROCESSING), и false для остальных. Выведите результат этого метода в main.

*/
/*
package homework25;

import java.awt.*;

public class MenuItem {

    private static String name;
    private static MenuItemType type;
    private static OrderStatus orderStatus;
    private static CheckboxMenuItem item;


    public static void main(String[] args) {
        checkMenuItem(type.DISH);
        checkOrderStatus(orderStatus.PROCESSING);
        canCancel(orderStatus.CANCELLED);

    }

    public MenuItem(String name, MenuItemType type, OrderStatus orderStatus, CheckboxMenuItem item) {
        this.name = name;
        this.type = type;
        this.orderStatus = orderStatus;
        this.item = item;
    }

    public String getName() {
        return name;
    }

    public MenuItemType getType() {
        return type;
    }

    public static OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public static CheckboxMenuItem getItem() {
        return item;
    }

    public static boolean isResult() {
        return result;
    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "name='" + name + '\'' +
                ", type=" + type +
                ", orderStatus=" + orderStatus +
                ", item=" + item +
                ", result=" + result +
                '}';
    }

    public static void checkMenuItem(MenuItemType type) {
        switch (type) {
            case DRINK:
                System.out.println(type.getDescription());
                break;
            case DISH:
                System.out.println(type.getDescription());
                break;
        }
    }

    public static void checkOrderStatus(OrderStatus orderStatus) {
        switch (orderStatus) {
            case PENDING:
                System.out.println(orderStatus.getDescription());
                break;
            case PROCESSING:
                System.out.println(orderStatus.getDescription());
                break;
            case SHIPPED:
                System.out.println(orderStatus.getDescription());
                break;
            default:
                System.out.println(orderStatus.getDescription());
                break;
        }
    }

    private static boolean result = false;

    private static void canCancel(OrderStatus orderStatus) {

        switch (orderStatus) {
            case PENDING:
                return true;

            case PROCESSING:
                result = true;
            default:
               return
        }
        System.out.println(result);

    }


}
*/