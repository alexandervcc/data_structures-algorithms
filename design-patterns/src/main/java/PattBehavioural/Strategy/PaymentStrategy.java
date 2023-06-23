package PattBehavioural.Strategy;

public interface PaymentStrategy {
    void pay(int amount);
}

class CreditCard implements PaymentStrategy{
    private String name;
    private String cardNumber;
    private String cvv;
    private String expDate;

    public CreditCard(String name, String cardNumber, String cvv, String expDate) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.expDate = expDate;
    }

    @Override
    public void pay(int amount) {
        System.out.println("CrCard transaction: "+amount);
    }
}

class PayPal implements PaymentStrategy{
    private String email;
    private String password;

    public PayPal(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public void pay(int amount) {
        System.out.println("PayPal transaction: "+amount);
    }
}