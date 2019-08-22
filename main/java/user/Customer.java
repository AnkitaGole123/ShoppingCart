package user;
import shoppingCart.Bill;
import shoppingCart.Cart;
import shoppingCart.Product;
import shoppingCart.TaxCalculator;

import java.util.Map;

public class Customer {
    public static void main(String[] args) {
        Product product1 = new Product("Chocolate",20,"FOOD",true);
        Product product2 = new Product("ek tha kutta",10,"CD",false);

        Cart cart = new Cart();
        cart.add(product1,2);
        cart.add(product2,1);
        TaxCalculator taxCalculator = new TaxCalculator();
        Map<Product,Double> tax = taxCalculator.taxCalculation(cart);

        Bill bill = new Bill();
        bill.generateBill(tax,cart);
        bill.printBill();
    }
}
