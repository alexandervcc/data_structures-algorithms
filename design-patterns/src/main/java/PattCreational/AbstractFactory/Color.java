package PattCreational.AbstractFactory;

public interface Color {
    void draw();
}

class RedImpl implements Color{
    @Override
    public void draw() {
        System.out.println("Red Color");
    }
}

class BlueImpl implements Color{
    @Override
    public void draw() {
        System.out.println("Blue Color");
    }
}
class Greenmpl implements Color{
    @Override
    public void draw() {
        System.out.println("Green Color");
    }
}