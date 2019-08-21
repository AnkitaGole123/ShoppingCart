package user;

import shoppingCart.Bill;
import shoppingCart.Product;
import shoppingCart.ShopKeeper;

public class Customer {
    public static void main(String[] args) {
        ShopKeeper shopKeeper = new ShopKeeper();
        Bill allProduct = new Bill();
        allProduct.getBill(2,"chips", false, "Food");
        for (Product product:allProduct.getProducts()){
            System.out.println(product);
        }
    }
}
