package shoppingCart;

public class Tax {
    final int salesTax = 10;
    final double importTax = 5;
    public double getTax(double amount, boolean importedProduct) {
        if (importedProduct){
            return (amount * importTax / 100);

        }else {
            System.out.println(amount * salesTax/ 100);
            return (amount * salesTax / 100);
        }
    }
}
