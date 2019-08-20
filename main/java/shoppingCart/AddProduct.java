package shoppingCart;

import java.util.ArrayList;
import java.util.List;

public class AddProduct {
    private List<Product> products = new ArrayList<>();

    public List<Product> addProduct(int quantity, int price, String category, String name, boolean importedProduct){
        Product product = new Product(quantity,price,category,name,importedProduct);
        products.add(product);
        return products;
    }
}
