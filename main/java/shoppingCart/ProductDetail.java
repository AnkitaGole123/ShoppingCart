package shoppingCart;

public class ProductDetail {
   public int quantity;
    public double price;
    public String category;
     public String name;

    public ProductDetail(int quantity, double price, String category, String name) {
        this.quantity = quantity;
        this.price = price;
        this.category = category;
        this.name = name;
    }

}
