package PattCreational.FactoryMethod.SingleCreator;

public interface Shape {
    void draw();
}

class RectangleImpl implements Shape{
    @Override
    public void draw() {
        System.out.println("Rectangle Draw");
    }
}

class CircleImpl implements Shape{
    @Override
    public void draw() {
        System.out.println("Circle Draw");
    }
}
class SquareImpl implements Shape{
    @Override
    public void draw() {
        System.out.println("Square Draw");
    }
}