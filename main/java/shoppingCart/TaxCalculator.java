package shoppingCart;

import java.util.*;

public class TaxCalculator {
    final int SALESTAX = 10;
    final double IMPORTTAX = 5;
    private List<String> exemptProduct = Arrays.asList("FOOD", "BOOK", "MEDICAL");
   public Map<Product, Double> totalTax = new HashMap<>();
    public void taxCalculation(Cart cart) {
        Map<Product, Integer> products = cart.getProducts();
        for (Map.Entry<Product, Integer> product: products.entrySet()) {
            double taxes = 0;
            double price = getPrice(product);
            if (product.getKey().importedProduct){
                taxes+= getTax(price, IMPORTTAX);
            }
           else if (!exemptProduct.contains(product.getKey().category)){
                taxes+=getTax(price,SALESTAX);
            }
           totalTax.put(product.getKey(),taxes);
        }
    }

    private double getPrice(Map.Entry<Product, Integer> product) {
       return product.getValue() * product.getKey().price;
    }

    public double getTax(double price, double taxRate){
        return price * taxRate / 100;
    }

    public Map<Product,Double> getBill() {
        return totalTax;
    }
}
