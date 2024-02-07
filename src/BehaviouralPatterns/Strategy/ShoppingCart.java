package BehaviouralPatterns.Strategy;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Item> items;

    public ShoppingCart() {
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        this.items.add(item);
    }

    public void removeItem(Item item) {
        this.items.remove(item);
    }

    public int calculateTotal() {
        int grand_total = 0;
        for (Item item: items) {
            grand_total += item.getItemPrice();
        }
        return grand_total;
    }

    public void pay(PaymentStrategy paymentMethod) {
        int amount = this.calculateTotal();

        paymentMethod.pay(amount);
    }
}
