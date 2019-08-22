package user;

        import shoppingCart.Cart;
        import shoppingCart.Product;
        import shoppingCart.TaxCalculator;

        import java.util.Map;

public class Customer {
    public static void main(String[] args) {
        Product product = new Product("Chocolate",20,"FOOD",true);

        Cart cart = new Cart();
        cart.add(product,1);

        TaxCalculator taxCalculator = new TaxCalculator();
        
    }
}
