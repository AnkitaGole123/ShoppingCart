package shoppingCart;

public class Product {

    public double price;
    public String name;
    public boolean importedProduct;
    String category;

    public Product( String name,int price, String category, boolean importedProduct) {
        this.price = price;
        this.name = name;
        this.importedProduct = importedProduct;
        this.category = category;
    }
    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public boolean isImportedProduct() {
        return importedProduct;
    }

    public String getCategory() {
        return category;
    }
}
