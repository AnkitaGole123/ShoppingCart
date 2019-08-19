package shoppingCartTest;

import org.junit.Test;
import shoppingCart.ProductDetail;

import static org.junit.Assert.assertEquals;

public class ShoppingTest {
    @Test
    public void itShouldGiveThePriceOfProduct(){
        ProductDetail productDetail = new ProductDetail(1,20, "food", "chips");
        double expected = 20;
        assertEquals(expected,productDetail.price,1);
    }
    @Test
    public void itShouldGiveTheQuantityOfProduct(){
        ProductDetail productDetail = new ProductDetail(1,20, "food", "chips");
        int expected = 1;
        assertEquals(expected,productDetail.quantity);
    }
}
