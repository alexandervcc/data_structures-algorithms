package PattCreational.FactoryMethod.SingleCreator;

public class Main {
    public static void main(String[] args) {
        ShapeFactory fact=new ShapeFactory();
        Shape s1=fact.getShape("CIRCLE");
        s1.draw();
        s1=fact.getShape("SQUARE");
        s1.draw();
        s1=fact.getShape("RECTANGLE");
        s1.draw();
    }
}
