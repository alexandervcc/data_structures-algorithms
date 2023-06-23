package PattBehavioural.Visitor;

public interface ItemElement {
    public int accept(ShoppingCartVisitor visitor);
}

class Book implements ItemElement{
    private int price;
    private String isbn;

    public Book(int price, String isbn) {
        this.price = price;
        this.isbn = isbn;
    }

    public int getPrice() {
        return price;
    }

    public String getIsbn() {
        return isbn;
    }

    @Override
    public int accept(ShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }
}

class Fruit implements ItemElement{
    private int price;
    private int weigth;
    private String name;

    public Fruit(int price, int weigth, String name) {
        this.price = price;
        this.weigth = weigth;
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public int getWeigth() {
        return weigth;
    }

    public String getName() {
        return name;
    }

    @Override
    public int accept(ShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }
}