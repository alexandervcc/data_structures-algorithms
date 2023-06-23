package PattCreational.FactoryMethod.StaticCreator;


public class ShapeFactory {
    public static Shape getShape(String  shapeType){
        if (shapeType == null) {
            return null;
        }else if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new CircleImpl();
        }else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new RectangleImpl();
        }else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new SquareImpl();
        }
        return null;
    }
}
