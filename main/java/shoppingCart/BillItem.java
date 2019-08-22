package shoppingCart;

public class BillItem {

    private CartItem cartItem;
    private double price;
    private double tax;

    public BillItem(CartItem cartItem, double price, double tax) {
        this.cartItem = cartItem;
        this.price = price;
        this.tax = tax;
    }

    public CartItem getCartItem() {
        return cartItem;
    }

    public double getPrice() {
        return price;
    }

    public double getTax() {
        return tax;
    }


}
