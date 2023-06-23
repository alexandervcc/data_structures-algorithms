package PattStructural.Decorator.Example01;

public class Client {
    public static void main(String[] args) {
        ConcreteComponent cc = new ConcreteComponent();

        ConcreteDecoratorEx1 cd1= new ConcreteDecoratorEx1();
        ConcreteDecoratorEx2 cd2= new ConcreteDecoratorEx2();

        //Decorate ConcreteComponent with ConcreteDecorator1
        cd1.setCom(cc);
        cd1.doJob();

        //Decorate ConcreteComponent with ConcreteDecorator2
        cd2.setCom(cd1);
        cd2.doJob();

    }
}
