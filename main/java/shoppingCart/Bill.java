package shoppingCart;

import java.util.ArrayList;
import java.util.HashMap;

import java.util.List;
import java.util.Map;

public class Bill {
    private double totalTaxAmount = 0;
    private double totalAllItemsCostAmount = 0;
    private List<Map<String, String>> bill = new ArrayList<>();

    public void generateBill(Map<Product,Double> product,Cart cart){
        Map<Product, Integer> products = cart.getProducts();
        for (Map.Entry<Product, Double> allItem : product.entrySet()){
            int quantity = products.get(allItem.getKey());
            Map<String, String> item = new HashMap<>();
            double price = allItem.getKey().getPrice() * quantity;
            item.put("name",allItem.getKey().getName());
            item.put("Price",String.valueOf(allItem.getKey().getPrice()));
            item.put("Category",allItem.getKey().getCategory());
            item.put("ImportedProduct",String.valueOf(allItem.getKey().isImportedProduct()));
            item.put("quantity", String.valueOf(quantity));
            totalTaxAmount += allItem.getValue();
            totalAllItemsCostAmount += costCalculate(allItem, price);
            bill.add(item);
        }
    }

    private double costCalculate(Map.Entry<Product, Double> item, double price) {
        return price + item.getValue();
    }

    public void printBill(){
        for (Map<String, String> aReceipt : this.bill){
            for (Map.Entry<String, String> item : aReceipt.entrySet()){
                System.out.print(item.getKey() +  " = " + item.getValue() + " " + "\n" );
            }
        }
        System.out.println("SalesTax = " + this.totalTaxAmount);
        System.out.println("TotalAmount = " + this.totalAllItemsCostAmount);
    }
}
