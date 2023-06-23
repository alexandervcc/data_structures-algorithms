package PattBehavioural.TemplateMethod;

public abstract class HouseTemplate {
    //Template Method, final so cannot be overriden
    public final void buildHouse(){
        buildFoundation();
        buildPilars();
        buildWalls();
        buildWindows();
        System.out.println("House is build");
    }

    public void buildWindows(){
        System.out.println("Building Glass Windows");
    }
    public abstract void buildWalls();
    public abstract void buildPilars();

    public void buildFoundation(){
        System.out.println("Building Foundations with: cement, iron, sand.");
    };

}

class WoodenHouse extends HouseTemplate{
    @Override
    public void buildWalls() {
        System.out.println("Building Walls with Wooden");
    }

    @Override
    public void buildPilars() {
        System.out.println("Building Pillars with Wooden");
    }
}

class GlassHouse extends HouseTemplate{
    @Override
    public void buildWalls() {
        System.out.println("Building Walls with Glass");
    }

    @Override
    public void buildPilars() {
        System.out.println("Building Pillars with Glass");
    }
}