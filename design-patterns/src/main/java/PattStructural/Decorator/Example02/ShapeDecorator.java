package PattStructural.Decorator.Example02;

public abstract class ShapeDecorator implements Shape{
    protected Shape decoratedsShape;

    public ShapeDecorator(Shape decoratedsShape) {
        this.decoratedsShape = decoratedsShape;
    }

    @Override
    public void draw() {
        decoratedsShape.draw();
    }
}

class RedShapeDecorator extends ShapeDecorator{
    public RedShapeDecorator(Shape decoratedsShape) {
        super(decoratedsShape);
    }

    @Override
    public void draw() {
        decoratedsShape.draw();
        setRedBorder(decoratedsShape);
    }

    private void setRedBorder(Shape decoratedShape){
        System.out.println("Border Color: RED");
    }
}
