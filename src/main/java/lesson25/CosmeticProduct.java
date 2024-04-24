package lesson25;

public class CosmeticProduct {

    private String productName;
    private String brand;
    private int price;

    public CosmeticProduct(String productName, String brand, int price) {
        this.productName = productName;
        this.brand = brand;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public String getBrand() {
        return brand;
    }

    public int getPrice() {
        return price;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("lesson25.CosmeticProduct{");
        sb.append("brand='").append(brand).append('\'');
        sb.append(", price=").append(price);
        sb.append(", productName='").append(productName).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public void apply(){
        System.out.println(getProductName() + "от бренда"+ getBrand() + "наносите так, чтобы было видно");



    }
}
