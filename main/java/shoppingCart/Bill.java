package shoppingCart;

import java.util.ArrayList;
import java.util.List;

public class Bill {
    private List<Product> products = new ArrayList<>();
    double totalAmount = 0;
    double totalTax = 0;
    Tax tax = new Tax();
    public void getBill(int quantity, int price, String name, boolean importedProduct, boolean taxable){
        Product product = new Product(quantity,price,name,importedProduct,taxable);
        products.add(product);
        totalTax+= tax.getTax(price,importedProduct,taxable);
        totalAmount += product.price*quantity;
        return;
    }
    public List<Product>getProducts(){
        return products;
    }
    public double getTotalAmount(){
        return totalAmount;
    }
    public double getTotalTax(){
        return totalTax;
    }
}
