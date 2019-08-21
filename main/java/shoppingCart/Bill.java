package shoppingCart;

import java.util.ArrayList;
import java.util.List;

public class Bill {
    private List<Product> products = new ArrayList<>();
    double totalAmount = 0;
    double totalTax = 0;
    Tax tax = new Tax();
    public void getBill( int price, String name, boolean importedProduct, String category){
        Product product = new Product(price,name,importedProduct,category);
        products.add(product);

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
