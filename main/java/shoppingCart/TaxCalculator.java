package shoppingCart;

import java.util.*;

public class TaxCalculator {
    final int SALESTAX = 10;
    final double IMPORTTAX = 5;

    private List<Category> exemptedProducts = Arrays.asList(Category.BOOK, Category.MEDICAL, Category.FOOD);


    public double calculate(CartItem cartItem) {
        Product product = cartItem.getProduct();
        double taxes = 0;
        double price = getPrice(cartItem);
        if (product.isImported()){
            taxes+= getTax(price, IMPORTTAX);
        }
        else if (!exemptedProducts.contains(product.getCategory())){
            taxes+=getTax(price,SALESTAX);
        }

        return taxes;
    }

    private double getPrice(CartItem cartItem) {
       return cartItem.getProduct().getPrice() * cartItem.getQuantity();
    }

    private double getTax(double price, double taxRate){
        return price * taxRate / 100;
    }

}
