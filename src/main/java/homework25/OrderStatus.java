package homework25;
public enum OrderStatus {
    PENDING("Order is pending approval."),

    PROCESSING("Order is in process."),

    SHIPPED("Order was shipped."),

    DELIVERED("Order was delivered."),

    CANCELLED("Order was cancelled.");

    private String description;

    OrderStatus(String description) {
        this.description = description;
    }
    public String getDescription() {
        return description;
    }
}
