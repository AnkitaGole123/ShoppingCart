package shoppingCartTest;

import org.junit.Test;
import shoppingCart.Product;
import shoppingCart.Tax;

import static org.junit.Assert.assertEquals;

public class ShoppingTest {
    @Test
    public void itShouldGiveThePriceOfProduct(){
        Product productDetail = new Product(1,20, "food", false,true);
        double expected = 20;
        assertEquals(expected,productDetail.price,1);
    }
    @Test
    public void itShouldGiveTheQuantityOfProduct(){
        Product productDetail = new Product(1,20, "food", true,false);
        int expected = 1;
        assertEquals(expected,productDetail.quantity);
    }
    @Test
    public void itShouldGiveTheNameOfProduct(){
        Product productDetail = new Product(1,20, "food", false,true);
        String expected = "chips";
        assertEquals(expected,productDetail.name);
    }

    @Test
    public void itShouldGiveTheSaleTax(){
        Tax tax = new Tax();
        double tax1 = tax.getTax(40, false,false);
        double expected = 8;
        assertEquals(expected,tax1,1);
    }
    @Test
    public void itShouldGiveTheImportTax(){
        Tax tax = new Tax();
        double tax1 = tax.getTax(40, true,true);
        double expected = 2;
        assertEquals(expected,tax1,1);
    }
}
