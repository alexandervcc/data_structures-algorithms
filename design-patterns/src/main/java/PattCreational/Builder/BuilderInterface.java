package PattCreational.Builder;

public interface BuilderInterface {
    void buildBody();
    void insertWheels();
    void addHeadLigths();
    Product getVehicle();
}

//Concrete BuildClases

class CarBuilder implements BuilderInterface{
    private Product p = new Product();
    @Override
    public void buildBody() {
        p.add("Car Body");
    }

    @Override
    public void insertWheels() {
        p.add("Car Wheels: 4");
    }

    @Override
    public void addHeadLigths() {
        p.add("Car Head Ligths: 2");
    }

    @Override
    public Product getVehicle() {
        return this.p;
    }
}

class MotorcycleBuilder implements BuilderInterface{
    private Product m = new Product();
    @Override
    public void buildBody()     {
        m.add("Motorcycle Body");
    }

    @Override
    public void insertWheels() {
        m.add("Motorcycle Wheels: 2");
    }

    @Override
    public void addHeadLigths() {
        m.add("Motorcycle Head Ligths: 1");
    }

    @Override
    public Product getVehicle() {
        return this.m;
    }
}