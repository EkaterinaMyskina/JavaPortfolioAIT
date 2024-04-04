package homework23;

import java.util.Objects;

public class ClothingItem {

    private String name;
    private int size;
    private String color;
    private String category;

    public ClothingItem(String name, int size, String color, String category) {
        this.name = name;
        this.size = size;
        this.color = color;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public String getCategory() {
        return category;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClothingItem that = (ClothingItem) o;
        return  Objects.equals(size, that.size) && Objects.equals(color, that.color) && Objects.equals(category, that.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,size, color, category);
    }

    @Override
    public String toString() {
        return "ClothingItem{" +
                "name='" + name + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}
