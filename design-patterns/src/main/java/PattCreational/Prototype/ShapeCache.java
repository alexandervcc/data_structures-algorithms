package PattCreational.Prototype;

import java.util.Hashtable;

public class ShapeCache {
    //Bank of clonable items
    private static Hashtable<String,Shape> shapeMap=new Hashtable<String,Shape> ();

    //Clonable Method
    public static Shape getShape(String shapeId){
        Shape cacheShape=shapeMap.get(shapeId);
        return (Shape) cacheShape.clone();
    }

    public static void loadItems(){
        Circle circle=new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(),circle);
        Square square=new Square();
        square.setId("2");
        shapeMap.put(square.getId(),square);
        Rectangle rectangle=new Rectangle();
        rectangle.setId("3");
        shapeMap.put(rectangle.getId(),rectangle);

    }

}
