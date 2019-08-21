package shoppingCart;

import java.util.Map;

public class Cart {
    public Map<Product, Integer> cart;

    public Cart(Map<Product, Integer> cart) {
        this.cart = cart;
    }
}
