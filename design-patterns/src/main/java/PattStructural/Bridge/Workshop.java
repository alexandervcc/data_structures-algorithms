package PattStructural.Bridge;

//IMPLEMENTATION
abstract class Workshop {
    abstract public void work();
}

class Produce extends Workshop{
    @Override
    public void work() {
        System.out.println("Produce");
    }
}
class Assemble extends Workshop{
    @Override
    public void work() {
        System.out.println("And Assembled");
    }
}


