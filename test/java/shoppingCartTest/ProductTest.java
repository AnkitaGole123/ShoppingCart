package shoppingCartTest;

import org.junit.Test;
import shoppingCart.Product;

import static org.junit.Assert.assertEquals;

public class ProductTest {
    @Test
    public void itShouldGiveThePriceOfProduct(){
        Product productDetail = new Product("chocolate",10,"FOOD",false);
        double expected = 10.0;
        assertEquals(expected,productDetail.getPrice(),1);
    }

    @Test
    public void itShouldGiveTheNameOfProduct(){
        Product productDetail = new Product("chocolate",10,"FOOD",false);
        String expected = "chocolate";
        assertEquals(expected,productDetail.getName());
    }

}
