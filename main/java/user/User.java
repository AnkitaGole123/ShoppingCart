package user;

import shoppingCart.AddProduct;
import shoppingCart.Product;

public class User {
    public static void main(String[] args) {
        AddProduct allProduct = new AddProduct();
        allProduct.addProduct(2,20, "chips", false,false);
        allProduct.addProduct(1,10, "CD", true,true);
        allProduct.addProduct(3,5, "bucket", false,true);
        for (Product product:allProduct.getProducts()){
            System.out.println(product);
        }
        System.out.println(" " + allProduct.getTotalAmount());
        System.out.println(" " + allProduct.getTotalTax());
    }
}
