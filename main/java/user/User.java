package user;

import shoppingCart.AllProduct;

public class User {
    public static void main(String[] args) {
        AllProduct allProduct = new AllProduct();
        allProduct.addProduct(2,20, "food", "chips",false);

        System.out.println(allProduct);
    }
}
