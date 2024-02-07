package BehaviouralPatterns.Strategy;

public class Item {
    private String itemCode;
    private int itemPrice;

    public Item(String itemCode, int itemPrice) {
        this.itemCode = itemCode;
        this.itemPrice = itemPrice;
    }

    public int getItemPrice() {
        return this.itemPrice;
    }
}
