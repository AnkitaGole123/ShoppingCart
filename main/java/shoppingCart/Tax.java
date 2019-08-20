package shoppingCart;

public class Tax {
    final int SALESTAX = 10;
    final double IMPORTTAX = 5;
    private double tax = 0.0;
    public double getTax(double amount, boolean importedProduct,boolean taxable) {
        if (taxable) {
            if (importedProduct) {
                return (amount * IMPORTTAX / 100);
            } else {
                return (amount * SALESTAX / 100);
            }
        }
        return tax;
    }
}
