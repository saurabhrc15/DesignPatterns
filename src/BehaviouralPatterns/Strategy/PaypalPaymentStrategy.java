package DesignPatterns.Strategy;

public class PaypalPaymentStrategy implements PaymentStrategy{
    private String username;
    private String password;

    public PaypalPaymentStrategy(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid by paypal account.");
    }
}
