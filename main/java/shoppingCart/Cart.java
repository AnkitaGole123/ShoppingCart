package shoppingCart;

import java.util.HashMap;
import java.util.Map;

public class Cart {
   Map<Product, Integer> cart = new HashMap<>();

    public Map<Product, Integer> addCart(Product product, Integer quantity){
        cart.put(product, quantity);
        return cart;
    }
}
