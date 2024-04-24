/*
Задача 1: Уникальные объекты недвижимости

Цель: Написать программу, которая будет использовать HashSet для хранения уникальных объектов недвижимости.
Каждый объект недвижимости должен быть представлен классом Property, содержащим минимум два поля:
address (адрес) и type (тип, например, квартира, дом, коммерческая недвижимость).

Задачи:

    Создать класс Property с полями address и type.
   Реализовать hashCode и equals для обеспечения уникальности объектов Property в HashSet на основе их адреса и типа.
    Создать HashSet и добавить в него несколько объектов недвижимости, включая дубликаты.
    Вывести содержимое HashSet на экран, чтобы продемонстрировать, что дубликаты были успешно исключены.
*/


package homework22;

import java.util.Objects;

public class Property {

    private String address;

    private String type;

    public Property(String address, String type) {
        this.address = address;
        this.type = type;
    }

    public String getAddress() {
        return address;
    }

    public String getType() {
        return type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Property property = (Property) o;
        return Objects.equals(address, property.address) && Objects.equals(type, property.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(address, type);
    }

    @Override
    public String toString() {
        return "Property{" +
                "address='" + address + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}





