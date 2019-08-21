package shoppingCart;

import java.util.Objects;

public class Product {
    public double price;
    public String name;
     public boolean importedProduct;
    String category;

    public Product(int price, String name, boolean importedProduct, String category) {
        this.price = price;
        this.name = name;
        this.importedProduct = importedProduct;
        this.category = category;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return Double.compare(product.price, price) == 0 &&
                importedProduct == product.importedProduct &&
                Objects.equals(name, product.name) &&
                Objects.equals(category, product.category);
    }

    @Override
    public String toString() {
        return "Product{" +
                "price=" + price +
                ", name='" + name + '\'' +
                ", importedProduct=" + importedProduct +
                ", category='" + category + '\'' +
                '}';
    }
}
