package Task_2;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Product> items = new ArrayList<>();

    public void addProduct(Product product) {
        items.add(product);
    }
    public double totalPrice(){
        double totalPrice =0;
        for (Product product : items) {
            totalPrice += product.getPrice() * product.getQuantity();
        }
        return totalPrice;
    }
    public void checkout(PaymentStrategy paymentStrategy) {
        double totalAmount = totalPrice();
        paymentStrategy.processPayment(totalAmount);
        items.clear();
    }

    public List<Product> getItems() {
        return items;
    }
}
