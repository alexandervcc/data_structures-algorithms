package PattBehavioural.Visitor;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<ItemElement> itemElement=new ArrayList<ItemElement>();
        itemElement.add(new Book(10,"001"));
        itemElement.add(new Fruit(3,4,"Banana"));
        itemElement.add(new Book(20,"002"));
        itemElement.add(new Book(41,"004"));
        itemElement.add(new Fruit(1,2,"Apple"));
        itemElement.add(new Book(19,"003"));
        itemElement.add(new Fruit(2,3,"Pineapple"));


        int totalCost=calculateCost(itemElement);
        System.out.println("Total Cost = "+String.valueOf(totalCost));
    }

    private static int calculateCost(List<ItemElement> items){
        ShoppingCartVisitor visitor=new ShopCartVisitorImpl();
        int cost=0;
        for (ItemElement ele:items) {
            cost+=ele.accept(visitor);
        }
        return cost;
    }
}
