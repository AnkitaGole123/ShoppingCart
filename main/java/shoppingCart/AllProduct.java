package shoppingCart;

import java.util.ArrayList;
import java.util.List;

public class AllProduct {
    private List<ProductDetail> products = new ArrayList<>();

    public List<ProductDetail> addProduct(String name, String category, int quantity, double price){
        ProductDetail product = new ProductDetail(quantity,price,category,name);
        products.add(product);
        return products;
    }
}
