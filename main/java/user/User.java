package user;

import shoppingCart.ProductDetail;

public class User {
    public static void main(String[] args) {

        ProductDetail productDetail = new ProductDetail(2,20, "food", "chips",false);
        System.out.println(productDetail.getPrice());
        System.out.println(productDetail.getSalesTax());
    }
}
