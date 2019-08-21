package shoppingCart;
public class Product {
    public double price;
    public String name;
    boolean importedProduct;
    String category;

    public Product(int price, String name, boolean importedProduct,String category) {
        this.price = price;
        this.name = name;
        this.importedProduct = importedProduct;
        this.category = category;
    }
}
