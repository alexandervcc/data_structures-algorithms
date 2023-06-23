package PattBehavioural.Strategy;

import java.util.ArrayList;
import java.util.List;

public class CartContext {
    private List<Item> items;

    public CartContext() {
        this.items = new ArrayList<>();
    }

    public void addItem(Item item){
        this.items.add(item);
    }

    public void removeItem(Item item){
        this.items.remove(item);
    }

    private int calculateTotal(){
        int sum=0;
        for(Item item:items){
            sum+=item.getPrice();
        }
        return sum;
    }

    public void pay (PaymentStrategy paymentStrategy){
        int amount = calculateTotal();
        paymentStrategy.pay(amount);
    }

}
