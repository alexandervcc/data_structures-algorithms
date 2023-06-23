package PattBehavioural.Visitor;

public interface ShoppingCartVisitor {
    int visit(Book book);
    int visit(Fruit fruit);
}

class ShopCartVisitorImpl implements ShoppingCartVisitor{
    @Override
    public int visit(Book book) {
        int cost=0;
        if(book.getPrice()>50){
            cost=book.getPrice()-5;
        }else {
            cost=book.getPrice();
        }
        System.out.println("Book ISBN: "+book.getIsbn()+" Cost = "+String.valueOf(cost));
        return cost;
    }

    @Override
    public int visit(Fruit fruit) {
        int cost = fruit.getPrice()*fruit.getWeigth();
        System.out.println(fruit.getName()+" Cost = "+String.valueOf(cost));
        return cost;
    }
}
