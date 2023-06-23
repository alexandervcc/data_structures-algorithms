package Principles.OpenClose;

public class Rectangle {
    public double width;
    public double height;
}
class Circle{
    public double radious;
}
class AreaCalculator{
    public double calculateAreaRect(Rectangle r){
        return r.height*r.width;
    }

    public double calculateAreaCirc(Circle c){
        return c.radious*(22/7)*c.radious;
    }
}

interface Shape{
    public double calculateArea();
}


class RectangleShapeImpl implements  Shape{
    public double w;
    public double h;
    @Override
    public double calculateArea() {
        return w*h;
    }
}

class CircleShapeImpl implements Shape{
    public double r;
    @Override
    public double calculateArea() {
        return (22/7)*r*r;
    }
}

class AreaCalculatorShape{
    public double calculateArea(Shape so){
        return so.calculateArea();
    }
}