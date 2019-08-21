package shoppingCartTest;

import org.junit.Test;
import shoppingCart.Cart;
import shoppingCart.Product;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class CartTest {
    @Test
    public void itShouldAddProductInCart() {
        Map<Product, Integer> expected = new HashMap<>();
        Product productDetail = new Product(1,"chips", false, "food");
        Cart cart = new Cart();
        cart.add(productDetail,1);
        expected.put(productDetail,1);
        assertEquals(expected,cart.getProducts());
    }
}
