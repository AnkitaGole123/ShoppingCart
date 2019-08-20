package shoppingCart;

import java.util.ArrayList;
import java.util.List;

public class AllProduct {
    private List<ProductDetail> products = new ArrayList<>();

    public List<ProductDetail> addProduct(int quantity, int price, String category, String name, boolean importedProduct){
        ProductDetail product = new ProductDetail(quantity,price,category,name,importedProduct);
        products.add(product);
        return products;
    }
}
