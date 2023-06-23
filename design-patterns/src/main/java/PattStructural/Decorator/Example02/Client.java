package PattStructural.Decorator.Example02;

public class Client {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape redCircle= new RedShapeDecorator(new Circle());
        Shape redRect = new RedShapeDecorator(new Rectangle());

        circle.draw();
        redCircle.draw();
        redRect.draw();
    }
}
