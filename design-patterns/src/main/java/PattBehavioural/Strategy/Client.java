package PattBehavioural.Strategy;

public class Client {
    public static void main(String[] args) {
        PaymentStrategy paymentStrategyCard =new CreditCard("Alexander","1","1","25/05");
        PaymentStrategy paymentStrategyPaypal =new PayPal("Alexander","XD");

        CartContext cart=new CartContext();

        cart.addItem(new Item("001",10));
        cart.addItem(new Item("002",20));
        cart.addItem(new Item("003",30));
        cart.addItem(new Item("004",39));

        cart.pay(paymentStrategyPaypal);
        cart.pay(paymentStrategyCard);


    }
}
