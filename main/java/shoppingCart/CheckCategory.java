package shoppingCart;

import java.util.Arrays;
import java.util.List;

public class CheckCategory {
    private List<ExemptProduct> exemptProducts = Arrays.asList(ExemptProduct.values());
    private Tax tax = new Tax();

    public double checkCategory(double price, String category, boolean importedProduct, int quantity){
        if (exemptProducts.toString().contains(category)){
            return price;
        }
        return price + tax.getTax(price,importedProduct);
    }
}
