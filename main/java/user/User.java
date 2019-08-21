package user;

import shoppingCart.Bill;
import shoppingCart.Product;

public class User {
    public static void main(String[] args) {
        Bill allProduct = new Bill();
        allProduct.getBill(2,20, "chips", false,false);
        allProduct.getBill(1,10, "CD", true,true);
        allProduct.getBill(3,5, "bucket", false,true);
        for (Product product:allProduct.getProducts()){
            System.out.println(product);
        }
        System.out.println(" " + allProduct.getTotalAmount());
        System.out.println(" " + allProduct.getTotalTax());
    }
}
