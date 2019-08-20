package shoppingCart;

public class Tax {
    final int salesTax = 10;
    final double importTax = 5;
    Amount price = new Amount();

    public double getTax(double amount, boolean importedProduct, int quantity) {
        if (importedProduct){
            double price = this.price.getPrice(amount, quantity);
            return (price * importTax / 100);
        }else {
            return (price.getPrice(amount,quantity) * salesTax / 100);
        }
    }
    public double takingTaxOrNot(boolean taxable,double amount, boolean importedProduct, int quantity) {
        if (taxable) {
            return getTax(amount, importedProduct,quantity);
        }
        return amount;
    }
}
