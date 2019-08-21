package shoppingCartTest;

import org.junit.Test;
import shoppingCart.Product;
import shoppingCart.TaxCalculator;

import static org.junit.Assert.assertEquals;

public class ShoppingTest {
    @Test
    public void itShouldGiveThePriceOfProduct(){
        Product productDetail = new Product(1,"fygh", false, "food");
        double expected = 20;
        assertEquals(expected,productDetail.price,1);
    }

    @Test
    public void itShouldGiveTheNameOfProduct(){
        Product productDetail = new Product(1,"fygh", false, "food");
        String expected = "chips";
        assertEquals(expected,productDetail.name);
    }

    @Test
    public void itShouldGiveTheSaleTax(){
        TaxCalculator tax = new TaxCalculator();
        double tax1 = tax.getTax(40, false,false);
        double expected = 8;
        assertEquals(expected,tax1,1);
    }
    @Test
    public void itShouldGiveTheImportTax(){
        TaxCalculator tax = new TaxCalculator();
        double tax1 = tax.getTax(40, true,true);
        double expected = 2;
        assertEquals(expected,tax1,1);
    }
}
