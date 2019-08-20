package shoppingCart;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return quantity == product.quantity &&
                Double.compare(product.price, price) == 0 &&
                importedProduct == product.importedProduct &&
                Objects.equals(category, product.category) &&
                Objects.equals(name, product.name);
    }

    @Override
    public String toString() {
        return "Product{" +
                "quantity=" + quantity +
                ", price=" + price +
                ", category='" + category + '\'' +
                ", name='" + name + '\'' +
                ", importedProduct=" + importedProduct +
                '}';
    }
}
