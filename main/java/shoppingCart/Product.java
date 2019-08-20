package shoppingCart;

public class Product {
    public int quantity;
    public double price;
    public String category;
    public String name;
    public boolean importedProduct;

    public Product(int quantity, int price, String category, String name, boolean importedProduct) {
        this.quantity = quantity;
        this.price = price;
        this.category = category;
        this.name = name;
        this.importedProduct = importedProduct;
    }
    public double getPrice(double price, int quantity) {
        return price * quantity;
    }
}
