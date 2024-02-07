package DesignPatterns.Strategy;

public class CreditCardPaymentStrategy implements PaymentStrategy{
    private String name;
    private String cardNumber;
    private String cvv;
    private String expiryDate;

    public CreditCardPaymentStrategy(String name, String cardNumber, String cvv, String expiryDate) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.expiryDate = expiryDate;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid by credit card");
    }
}
