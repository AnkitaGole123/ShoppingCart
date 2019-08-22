package shoppingCart;

import java.util.ArrayList;
import java.util.List;

public class BillGenerator {

    private TaxCalculator taxCalculator;

    public BillGenerator(TaxCalculator taxCalculator) {
        this.taxCalculator = taxCalculator;
    }

    public Bill generateBill(Cart cart) {
        List<CartItem> cartItems = cart.getCartItems();

        double totalTaxAmount = 0;
        double totalAllItemsCostAmount = 0;

        List<BillItem> billItems = new ArrayList<>();
        for (CartItem cartItem : cartItems) {
            int quantity = cartItem.getQuantity();
            double price = cartItem.getProduct().getPrice() * quantity;
            double calculatedTax = taxCalculator.calculate(cartItem);

            totalTaxAmount += calculatedTax;
            totalAllItemsCostAmount += price;

            BillItem billItem = new BillItem(cartItem, price, calculatedTax);
            billItems.add(billItem);
        }
        Bill bill = new Bill(billItems,totalTaxAmount, totalAllItemsCostAmount);
        return bill;
    }


}
