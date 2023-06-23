package PattCreational.FactoryMethod.StrictCreator;

public class Client {
    public static void main(String[] args) {
        Shape s1=new CircleFactory().getShape();
        s1.draw();
        Shape s2=new RectangleFactory().getShape();
        s2.draw();
        Shape s3=new SquareFactory().getShape();
        s3.draw();
    }
}
