package PattCreational.AbstractFactory;

public class Client {
    public static void main(String[] args) {
        //Get Factory
        AbstractFactory shapeF=FactoryProducer.getFactory("SHAPE");
        AbstractFactory colorF=FactoryProducer.getFactory("COLOR");
        Shape s1=shapeF.getShape("SQUARE");
        s1.draw();
        Color c1= colorF.getColor("RED");
        c1.draw();

    }
}
