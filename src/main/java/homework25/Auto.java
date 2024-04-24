

package homework25;

import java.util.Objects;

public class Auto {

    private static String vinCode; // уникальный ID - код VIN
    private static String brand; // марка машины
    private static String model; // модель машины
    private static int price; // цена в центах, чтобы избежать погрешности
    private static int yearOfProduction; // год изготовления
    private static String shortCharacteristics; // краткая инфа по машине
    private static String fullCharacteristics; // полная инфа по машине
    private static String color; // цвет машины

    public Auto(String vinCode, String brand, String model, int price, int yearOfProduction,
                String shortCharacteristics, String fullCharacteristics, String color) {
        this.vinCode = vinCode;
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.yearOfProduction = yearOfProduction;
        this.shortCharacteristics = shortCharacteristics;
        this.fullCharacteristics = fullCharacteristics;
        this.color = color;
    }

    public static String getVinCode() {
        return vinCode;
    }

    public static String getBrand() {
        return brand;
    }

    public static String getModel() {
        return model;
    }

    public static int getPrice() {
        return price;
    }

    public static int getYearOfProduction() {
        return yearOfProduction;
    }

    public static String getShortCharacteristics() {
        return shortCharacteristics;
    }

    public static String getFullCharacteristics() {
        return fullCharacteristics;
    }

  /*  public static void getColor() {
        return color;
    }*/

    public static void setBrand(String brand) {
        Auto.brand = brand;
    }

    public static void setModel(String model) {
        Auto.model = model;
    }

    public static void setPrice(int price) {
        Auto.price = price;
    }

    public static void setYearOfProduction(int yearOfProduction) {
        Auto.yearOfProduction = yearOfProduction;
    }

    public static void setShortCharacteristics(String shortCharacteristics) {
        Auto.shortCharacteristics = shortCharacteristics;
    }

    public static void setFullCharacteristics(String fullCharacteristics) {
        Auto.fullCharacteristics = fullCharacteristics;
    }

    public static void setColor(String color) {
        Auto.color = color;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "VIN код машины: '" + vinCode + '\'' +
                ", Марка: '" + brand + '\'' +
                ", Модель машины: '" + model + '\'' +
                ", Цвет машины: '" + color + '\'' +
                ", Цена: '" + price + '\'' +
                ", Год производства: '" + yearOfProduction + '\'' +
                ", Краткое описание: '" + shortCharacteristics + '\'' +
                ", Полное описание: '" + fullCharacteristics + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Auto that = (Auto) o;
        return Objects.equals(brand, that.brand) && Objects.equals(model, that.model) && Objects.equals(price, that.price) && Objects.equals(color, that.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, price, color);
    }
}



