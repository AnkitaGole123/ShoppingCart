package shoppingCart;

import java.util.List;

public class Bill {
    private List<BillItem> billItems;
    private double totalTaxAmount;
    private double totalAllItemsCostAmount;

    public Bill(List<BillItem> billItems, double totalTaxAmount, double totalAllItemsCostAmount) {
        this.billItems = billItems;
        this.totalTaxAmount = totalTaxAmount;
        this.totalAllItemsCostAmount = totalAllItemsCostAmount;
    }

    public void print(){
        for (BillItem billItem : billItems){
                System.out.printf("%20s   %5d   %10f   %10f   %10f\n",
                        billItem.getCartItem().getProduct().getName()
                        , billItem.getCartItem().getQuantity()
                        , billItem.getCartItem().getProduct().getPrice()
                        ,billItem.getTax()
                        ,billItem.getPrice() + billItem.getTax());
        }
        System.out.printf("%67s\n", "-----------------------------------------------------");
        System.out.printf("%20s   %5s   %10f   %10f   %10f",
                ""
                , ""
                ,totalAllItemsCostAmount
                ,totalTaxAmount
                ,(totalTaxAmount + totalAllItemsCostAmount));

    }



}
