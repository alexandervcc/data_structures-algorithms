package PattStructural.Bridge;

//ABSTRACTIONS
public abstract class Vehicle {
    protected Workshop workshop1;
    protected Workshop workshop2;

    protected  Vehicle(Workshop w1, Workshop w2){
        this.workshop1=w1;
        this.workshop2=w2;
    }
    abstract public  void manufacture();
}

class Car extends Vehicle{

    public Car(Workshop w1, Workshop w2) {
        super(w1, w2);
    }

    @Override
    public void manufacture() {
        System.out.println("CAR  Cretated");
        workshop1.work();
        workshop2.work();
    }
}

class Bike extends Vehicle{

    public Bike(Workshop w1, Workshop w2) {
        super(w1, w2);
    }

    @Override
    public void manufacture() {
        System.out.println("BIKE Cretated");
        workshop1.work();
        workshop2.work();
    }
}