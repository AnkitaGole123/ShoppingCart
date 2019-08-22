package user;
import shoppingCart.*;

public class Customer {
    public static void main(String[] args) {
        Product product1 = new Product("Chocolate",20, Category.FOOD,true);
        Product product2 = new Product("ABCD",10,Category.OTHER,false);
        Product product3 = new Product("Chips",15,Category.FOOD,false);
        Product product4 = new Product("Java",150,Category.BOOK,false);

        Cart cart = new Cart();
        cart.add(product1,2);
        cart.add(product2,1);
        cart.add(product3,5);
        cart.add(product4,4);

        BillGenerator billGenerator = new BillGenerator(new TaxCalculator());
        Bill bill = billGenerator.generateBill(cart);
        bill.print();
    }
}
