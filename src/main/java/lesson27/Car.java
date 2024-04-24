package lesson27;

public class Car extends Vehicle{
    private int numDoors;

    public Car(String brand, int year, int numDoors) {

        super(brand, year);
        this.numDoors = numDoors;
    }

    public int getNumDoors() {
        return numDoors;
    }

    public void setNumDoors(int numDoors) {
        this.numDoors = numDoors;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("homework27.Car{");
        sb.append("brand='").append(getBrand()).append('\'');
        sb.append(", numDoors=").append(numDoors);
        sb.append(", year=").append(getYear());
        sb.append('}');
        return sb.toString();
    }
}
