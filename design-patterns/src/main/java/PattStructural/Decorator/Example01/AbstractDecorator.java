package PattStructural.Decorator.Example01;

abstract class AbstractDecorator extends Component{
    protected Component com;

    public void setCom(Component parCom){
        this.com=parCom;
    }

    @Override
    public void doJob() {
        if(com!=null){
            com.doJob();
        }
    }
}

class ConcreteDecoratorEx1 extends AbstractDecorator{
    @Override
    public void doJob() {
        super.doJob();

        //additional reponsabilities
        System.out.println("Explicit Example 1");
    }
}

class ConcreteDecoratorEx2 extends AbstractDecorator{
    @Override
    public void doJob() {
        super.doJob();

        //additional reponsabilities
        System.out.println("Explicit Example 2");
    }
}