package PattCreational.FactoryMethod.StrictCreator;

public abstract class AbstractShapeFactory {
    protected abstract Shape factoryMethod();

    public Shape getShape(){
        return factoryMethod();
    }
}

//Concrete FActories
class SquareFactory extends AbstractShapeFactory{
    @Override
    protected Shape factoryMethod() {
        return new SquareImpl();
    }
}
class CircleFactory extends AbstractShapeFactory{
    @Override
    protected Shape factoryMethod() {
        return new CircleImpl();
    }
}
class RectangleFactory extends AbstractShapeFactory{
    @Override
    protected Shape factoryMethod() {
        return new RectangleImpl();
    }
}