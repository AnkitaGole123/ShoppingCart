package shoppingCart;

public class Tax {
    public double getTax(double amount, boolean importedProduct) {
        if (importedProduct){
            double importTax = 5;
            return (amount * importTax / 100);

        }else {
            int salesTax = 10;
            return (amount * salesTax / 100);
        }
    }

}
