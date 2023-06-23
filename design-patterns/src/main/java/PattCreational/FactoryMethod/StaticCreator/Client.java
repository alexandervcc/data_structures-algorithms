package PattCreational.FactoryMethod.StaticCreator;

public class Client {
    public static void main(String[] args) {
        Shape s1= ShapeFactory.getShape("CIRCLE");
        s1.draw();
        s1= ShapeFactory.getShape("SQUARE");
        s1.draw();
        s1= ShapeFactory.getShape("RECTANGLE");
        s1.draw();
    }
}
