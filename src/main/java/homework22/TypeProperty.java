/*
Задача 2: Фильтрация по типу недвижимости

        Цель: Используя HashSet, написать метод, который фильтрует набор объектов недвижимости по заданному типу и возвращает
        новый HashSet с объектами указанного типа.

        Задачи:

        Использовать класс Property из задачи 1.
        Написать метод filterByType, который принимает HashSet<Property> и String type, и возвращает HashSet<Property>,
        содержащий только объекты недвижимости заданного типа.
        Продемонстрировать работу метода filterByType, создав исходный HashSet с различными типами недвижимости и выводя результаты фильтрации.
*/
package homework22;

import java.util.HashSet;
import java.util.Iterator;

public class TypeProperty {
    public static void main(String[] args) {
        HashSet<String> hashSetType = new HashSet<>();

        hashSetType.add("Apartment");
        hashSetType.add("House");
        hashSetType.add("Office");
        hashSetType.add("House");

        for (String type : hashSetType) {
            System.out.println(type);
        }


    }
}




