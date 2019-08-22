package shoppingCartTest;

import org.junit.Test;
import shoppingCart.Cart;
import shoppingCart.Product;
import shoppingCart.TaxCalculator;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class TaxCalculatorTest {
    @Test
    public void itShouldGiveTax() {
        Map<Product, Integer> expected = new HashMap<>();
        Product productDetail = new Product(1,"chips", false, "food");
        Cart cart = new Cart();
        cart.add(productDetail,1);
        TaxCalculator taxCalculator = new TaxCalculator();
        taxCalculator.taxCalculation(cart);
        assertEquals(expected,taxCalculator);
    }
}
