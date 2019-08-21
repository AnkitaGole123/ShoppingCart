package shoppingCart;

public class TaxCalculator {
    final int SALESTAX = 10;
    final double IMPORTTAX = 5;
    private double tax = 0.0;
    Cart cart = new Cart();
    public double getTax(double amount, boolean importedProduct,boolean taxable) {
            if (importedProduct) {
                return (amount * IMPORTTAX / 100);
            } else {
                return (amount * SALESTAX / 100);
            }
    }
}
