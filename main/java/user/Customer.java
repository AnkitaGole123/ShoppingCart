package user;

        import shoppingCart.Bill;
        import shoppingCart.ShopKeeper;

public class Customer {
    public static void main(String[] args) {
        Bill bill = new Bill();
        ShopKeeper shopKeeper = new ShopKeeper();
        shopKeeper.shopKepper(10,"chips","Food",2,true);
    }
}
