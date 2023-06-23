package PattBehavioural.TemplateMethod;

public class Client {
    public static void main(String[] args) {
        HouseTemplate house1=new GlassHouse();
        HouseTemplate house2=new WoodenHouse();

        house1.buildHouse();
        house2.buildHouse();
    }
}
