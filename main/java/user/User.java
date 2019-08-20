package user;

import shoppingCart.AddProduct;
import shoppingCart.Product;

public class User {
    public static void main(String[] args) {
        AddProduct allProduct = new AddProduct();
        allProduct.addProduct(2,20, "food", "chips",false);
        Product productDetail = new Product(2,20, "food", "chips",true);

    }
}
