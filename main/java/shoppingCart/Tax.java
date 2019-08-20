package shoppingCart;

public class Tax {
    final int salesTax = 10;
    final double importTax = 5;
    double tax = 0.0;
    public double getTax(double amount, boolean importedProduct,boolean taxable) {
        if (taxable) {
            if (importedProduct) {
                return (amount * importTax / 100);
            } else {
                return (amount * salesTax / 100);
            }
        }
        return tax;
    }
}
