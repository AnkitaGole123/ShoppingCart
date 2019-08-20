package shoppingCart;

import java.util.ArrayList;
import java.util.List;

public class AddProduct {
    private List<Product> products = new ArrayList<>();

    public void addProduct(int quantity, int price, String name, boolean importedProduct,boolean taxable){
        Product product = new Product(quantity,price,name,importedProduct,taxable);
        products.add(product);
        return;
    }
    public List<Product>getProducts(){
        return products;
    }
}
