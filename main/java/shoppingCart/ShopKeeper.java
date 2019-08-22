package shoppingCart;

public class ShopKeeper {
    public void shopKepper(int price, String name, String category, Integer quantity, boolean imported){

        Product product = new Product(price,name,imported,category);
        Cart cart = new Cart();
        cart.add(product,quantity);
        TaxCalculator taxCalculator = new TaxCalculator();
        taxCalculator.taxCalculation(cart);
    }
}
