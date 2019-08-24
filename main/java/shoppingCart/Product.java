package shoppingCart;

public class Product {

    private double price;
    private String name;
    private boolean isImported;
    private Category category;

    public Product(String name, int price, Category category, boolean isImported) {
        this.price = price;
        this.name = name;
        this.isImported = isImported;
        this.category = category;
    }
    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public boolean isImported() {
        return isImported;
    }

    public Category getCategory() {
        return category;
    }
}
