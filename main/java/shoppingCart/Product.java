package shoppingCart;

import java.util.Objects;

public class Product {
    public int quantity;
    public double price;
    public String name;
    public boolean importedProduct;
    boolean taxable;

    public Product(int quantity, int price, String name, boolean importedProduct,boolean taxable) {
        this.quantity = quantity;
        this.price = price;
        this.name = name;
        this.importedProduct = importedProduct;
        this.taxable = taxable;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return quantity == product.quantity &&
                Double.compare(product.price, price) == 0 &&
                importedProduct == product.importedProduct &&
                taxable == product.taxable &&
                Objects.equals(name, product.name);
    }

    @Override
    public String toString() {
        return
                " quantity=" + quantity +'\n' +
                " price=" + price + '\n' +
                " name='" + name + '\n' +
                " importedProduct=" + importedProduct + '\n' +
                " taxable=" + taxable;
    }
}
