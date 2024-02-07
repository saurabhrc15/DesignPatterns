package BehaviouralPatterns.Strategy;

public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.addItem(new Item("ABC", 12));
        cart.addItem(new Item("XYZ", 24));

        cart.pay(new PaypalPaymentStrategy("saurabh", "123456"));
        cart.pay(new CreditCardPaymentStrategy("saurabh", "12564525", "452", "2028-12"));
    }
}
