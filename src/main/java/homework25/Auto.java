package homework25;

import java.util.Objects;

public class Auto {

    private String vinCode; // уникальный ID - код VIN
    private String brand; // марка машины
    private String model; // модель машины
    private int price; // цена в центах, чтобы избежать погрешности
    private int yearOfProduction; // год изготовления
    private String shortCharacteristics; // краткая инфа по машине
    private String fullCharacteristics; // полная инфа по машине
    private String color; // цвет машины
    // НАДО ДОБАВИТЬ ФОТО МАШИНЫ


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

    public String getVinCode() {
        return vinCode;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getPrice() {
        return price / 100;
    } // изначально цена в евроцентах. делим на 100, чтобы избежать погрешности

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public String getShortCharacteristics() {
        return shortCharacteristics;
    }

    public String getFullCharacteristics() {
        return fullCharacteristics;
    }

    public String getColor() {
        return color;
    }

    public void setVinCode(String vinCode) {
        this.vinCode = vinCode;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public void setShortCharacteristics(String shortCharacteristics) {
        this.shortCharacteristics = shortCharacteristics;
    }

    public void setFullCharacteristics(String fullCharacteristics) {
        this.fullCharacteristics = fullCharacteristics;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("homework25.Auto{");
        sb.append("brand='").append(brand).append("\n");
        sb.append(", color='").append(color).append("\n");
        sb.append(", fullCharacteristics='").append(fullCharacteristics).append("\n");
        sb.append(", model='").append(model).append("\n");
        sb.append(", price=").append(price);
        sb.append(", shortCharacteristics='").append(shortCharacteristics).append("\n");
        sb.append(", vinCode='").append(vinCode).append("\n");
        sb.append(", yearOfProduction=").append(yearOfProduction);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Auto that = (Auto) o;
        return Objects.equals(vinCode, that.vinCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vinCode);
    }

}


