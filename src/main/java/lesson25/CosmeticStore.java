package lesson25;

public class CosmeticStore {
    private String storeName;
    private String location;


    public CosmeticStore(String storeName, String location) {
        this.storeName = storeName;
        this.location = location;
    }

    public String getStoreName() {
        return storeName;
    }

    public String getLocation() {
        return location;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("lesson25.CosmeticStore{");
        sb.append("location='").append(location).append('\'');
        sb.append(", storeName='").append(storeName).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public void describe(){
        System.out.println("Название магазина: " + getStoreName() + "Адрес магазина: " + getLocation());
    }
}
