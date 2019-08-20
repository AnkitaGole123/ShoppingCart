package user;

import shoppingCart.AddProduct;
import shoppingCart.Product;
import shoppingCart.Tax;

public class User {
    public static void main(String[] args) {
        AddProduct allProduct = new AddProduct();
        Tax tax = new Tax();
        allProduct.addProduct(2,20, "chips", false,false);
        for (Product product:allProduct.getProducts()){
            System.out.println(product);
        }
        System.out.println();
    }
}
