package shoppingCart;

public class ProductDetail {
    public int quantity;
    public double price;
    public String category;
    public String name;
    public boolean importedProduct;

    public ProductDetail(int quantity, int price, String category, String name, boolean importedProduct) {
        this.quantity = quantity;
        this.price = price;
        this.category = category;
        this.name = name;
        this.importedProduct = importedProduct;
    }

}
