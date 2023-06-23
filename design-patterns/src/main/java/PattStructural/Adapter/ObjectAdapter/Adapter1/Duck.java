package PattStructural.Adapter.Adapter1;

public interface Duck {
    public void quak();
    public void fly();
}

class MallardDuck implements Duck{
    @Override
    public void quak() {
        System.out.println("Quak - Mallard");
    }

    @Override
    public void fly() {
        System.out.println("Fly Large Distance- Mallard");
    }
}


