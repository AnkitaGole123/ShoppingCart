package shoppingCart;

import java.util.Map;

public class ShopKeeper {
    public Map<Product, Integer> cart;
    public void shopKepper(int price, String name, String category, Integer quantity, boolean imported){
        Product product = new Product(price,name,imported,category);
        cart.put(product,quantity);
    }
}
