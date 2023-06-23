package PattStructural.Adapter.Adapter1;

public interface Turkey {
    public void gobble();
    public void fly();
}

class WildTurkey implements Turkey{
    @Override
    public void gobble() {
        System.out.println("Gooble - Turkey");
    }

    @Override
    public void fly() {
        System.out.println("Fly Short Distance- Turkey");
    }
}
