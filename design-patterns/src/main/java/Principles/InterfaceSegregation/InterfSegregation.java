package Principles.InterfaceSegregation;

public class InterfSegregation {
}

interface ShapeInterface{
    public double area();
    public double volume();
}

interface BiShapeInterface{
    public double area();
}

interface TriShapeInterface{
    public double volume();
}

interface ManageShapeInterface{
    public double CalculateMethod();
}

class Cube implements BiShapeInterface,TriShapeInterface,ManageShapeInterface{
    @Override
    public double area() {
        return 0;
    }

    @Override
    public double volume() {
        return 0;
    }

    @Override
    public double CalculateMethod() {
        return this.area()+this.volume();
    }
}

class Square implements BiShapeInterface,ManageShapeInterface{
    @Override
    public double area() {
        return 0;
    }

    @Override
    public double CalculateMethod() {
        return this.area();
    }
}


