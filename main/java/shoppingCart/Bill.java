package shoppingCart;

import java.util.HashMap;

import java.util.Map;

public class Bill {

    public void generateBill(Cart cart){
        Map<String, String> receipt = new HashMap<>();
        Map<Product, Integer> products = cart.getProducts();
        double total;
        for (Map.Entry<Product, Integer> allItem : products.entrySet()){
            total = allItem.getKey().price + allItem.getValue();
            receipt.put("Tax", String.valueOf(allItem.getValue()));
            receipt.put("TotalAmount", String.valueOf(total));
            receipt.put("name",allItem.getKey().name);
            receipt.put("Price",String.valueOf(allItem.getKey().price));
            receipt.put("Category",allItem.getKey().category);
            receipt.put("ImportedProduct",String.valueOf(allItem.getKey().importedProduct));
            System.out.println(receipt);
        }
    }
}
