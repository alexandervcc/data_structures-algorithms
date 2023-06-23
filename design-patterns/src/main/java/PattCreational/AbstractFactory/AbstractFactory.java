package PattCreational.AbstractFactory;

public abstract class AbstractFactory {
    abstract Color getColor(String str);
    abstract Shape getShape(String str);
}

class ShapeFactory extends AbstractFactory{

    @Override
    Shape getShape(String str) {
        if(str==null){
            return null;
        }else if(str.equalsIgnoreCase("CIRCLE")){
            return new CircleImpl();
        }else if(str.equalsIgnoreCase("RECTANGLE")){
            return new RectangleImpl();
        }else if(str.equalsIgnoreCase("SQUARE")){
            return new SquareImpl();
        }
        return null;
    }
    @Override
    Color getColor(String str) {
        return null;
    }

}

class ColorFactory extends AbstractFactory{
    @Override
    Color getColor(String str) {
        if(str==null){
            return null;
        }else if(str.equalsIgnoreCase("RED")){
            return new RedImpl();
        }else if(str.equalsIgnoreCase("BLUE")){
            return new BlueImpl();
        }else if(str.equalsIgnoreCase("GREEN")){
            return new Greenmpl();
        }
        return null;
    }

    @Override
    Shape getShape(String str) {
        return null;
    }
}