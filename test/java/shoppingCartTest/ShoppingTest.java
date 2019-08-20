package shoppingCartTest;

import org.junit.Test;
import shoppingCart.ProductDetail;
import shoppingCart.Tax;

import static org.junit.Assert.assertEquals;

public class ShoppingTest {
    @Test
    public void itShouldGiveThePriceOfProduct(){
        ProductDetail productDetail = new ProductDetail(1,20, "food", "chips",true);
        double expected = 20;
        assertEquals(expected,productDetail.price,1);
    }
    @Test
    public void itShouldGiveTheQuantityOfProduct(){
        ProductDetail productDetail = new ProductDetail(1,20, "food", "chips",false);
        int expected = 1;
        assertEquals(expected,productDetail.quantity);
    }
    @Test
    public void itShouldGiveTheCategoryOfProduct(){
        ProductDetail productDetail = new ProductDetail(1,20, "food", "chips",true);
        String expected = "food";
        assertEquals(expected,productDetail.category);
    }
    @Test
    public void itShouldGiveTheNameOfProduct(){
        ProductDetail productDetail = new ProductDetail(1,20, "food", "chips",true);
        String expected = "chips";
        assertEquals(expected,productDetail.name);
    }

    @Test
    public void itShouldGiveTheSaleTax(){
        Tax tax = new Tax();
        double tax1 = tax.getTax(40, false);
        double expected = 4;
        assertEquals(expected,tax1,1);
    }
    @Test
    public void itShouldGiveTheImportTax(){
        Tax tax = new Tax();
        double tax1 = tax.getTax(40, true);
        double expected = 2;
        assertEquals(expected,tax1,1);
    }
}
