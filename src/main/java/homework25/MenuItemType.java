package homework25;

public enum MenuItemType {
    DRINK("кофе"),
    DISH("пицца");
    private String description;
    MenuItemType(String description) {
        this.description = description;
    }
    public String getDescription() {
        return description;
    }
}
