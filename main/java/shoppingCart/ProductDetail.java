package shoppingCart;

public class ProductDetail {
    public int quantity;
    public double price;
    public String category;
    public String name;
    final int salesTax = 10;
    public boolean importedProduct;
    final double importTax = 5;

    public ProductDetail(int quantity, double price, String category, String name, boolean importedProduct) {
        this.quantity = quantity;
        this.price = price;
        this.category = category;
        this.name = name;
        this.importedProduct = importedProduct;
    }

    public double getPrice() {
        return quantity * price;
    }

    public double getSalesTax() {
        if (importedProduct){
        return (getPrice() * importTax / 100);

    }else {
        return (getPrice() * salesTax / 100);
        }
    }
}
