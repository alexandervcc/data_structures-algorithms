package PattCreational.Builder;

public class Client {
    public static void main(String[] args) {
        Director d=new Director();

        //Car
        BuilderInterface car=new CarBuilder();
        d.construct(car);
        Product p1=car.getVehicle();
        p1.show();

        //Motorcycle
        BuilderInterface motorcycle=new MotorcycleBuilder();
        d.construct(motorcycle);
        Product p2=motorcycle.getVehicle();
        p2.show();

    }
}
