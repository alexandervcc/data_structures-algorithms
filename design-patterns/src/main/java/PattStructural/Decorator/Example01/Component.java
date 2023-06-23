package PattStructural.Decorator.Example01;

public abstract class Component {
    public abstract void doJob();
}

class ConcreteComponent extends Component{
    @Override
    public void doJob() {
        System.out.println("Concrete Component - Closed for Modification");
    }
}

