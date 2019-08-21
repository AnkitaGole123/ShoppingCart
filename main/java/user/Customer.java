package user;

import shoppingCart.Bill;
import shoppingCart.Product;

public class Customer {
    public static void main(String[] args) {
        Bill allProduct = new Bill();
        allProduct.getBill(2,"chips", false, "Food");
        for (Product product:allProduct.getProducts()){
            System.out.println(product);
        }
        System.out.println(" " + allProduct.getTotalAmount());
        System.out.println(" " + allProduct.getTotalTax());
    }
}
