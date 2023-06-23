package PattCreational.FactoryMethod.StrictCreator;

//ProductInterface Shape
interface Shape{
    void draw();
}

//Prudcots that Implement the Prodyct Interface
class RectangleImpl implements Shape{
    @Override
    public void draw() {
        System.out.println("Draw Method from Rectangle");
    }
}

class CircleImpl implements Shape{
    @Override
    public void draw() {
        System.out.println("Draw Method from Circle");
    }
}

class SquareImpl implements Shape{
    @Override
    public void draw() {
        System.out.println("Draw Method from Square");
    }
}
