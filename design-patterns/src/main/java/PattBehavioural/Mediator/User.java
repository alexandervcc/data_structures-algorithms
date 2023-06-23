package PattBehavioural.Mediator;

public abstract class User {
    protected ChatMediator mediator;
    protected String name;

    public User(ChatMediator mediator, String name){
        this.mediator=mediator;
        this.name=name;
    }

    public abstract void send(String msg);
    public abstract void receive(String msg);

}

class UserImpl extends User{
    public UserImpl(ChatMediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void send(String msg) {
        System.out.println("I: "+this.name+ " Sending Message: "+msg);
        this.mediator.sendMessage(msg,this);
    }

    @Override
    public void receive(String msg) {
        System.out.println("I: "+this.name+ " Receiving Message: "+msg);
    }
}