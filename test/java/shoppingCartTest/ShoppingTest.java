package shoppingCartTest;

import org.junit.Test;
import shoppingCart.Product;
import shoppingCart.TaxCalculator;

import static org.junit.Assert.assertEquals;

public class ShoppingTest {
    @Test
    public void itShouldGiveThePriceOfProduct(){
        Product productDetail = new Product(1,"fygh", false, "food");
        double expected = 1.0;
        assertEquals(expected,productDetail.price,1);
    }

    @Test
    public void itShouldGiveTheNameOfProduct(){
        Product productDetail = new Product(1,"chips", false, "food");
        String expected = "chips";
        assertEquals(expected,productDetail.name);
    }

}
