package user;

import shoppingCart.ProductDetail;

public class User {
    public static void main(String[] args) {
        ProductDetail productDetail = new ProductDetail(1,20, "food", "chips");
        System.out.println(productDetail.category);
    }
}
