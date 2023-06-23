package PattBehavioural.Mediator;

public class Client {
    public static void main(String[] args) {
        ChatMediator mediator=new ChatMediatorImpl();
        User user1=new UserImpl(mediator,"1");
        User user2=new UserImpl(mediator,"2");
        User user3=new UserImpl(mediator,"3");
        User user4=new UserImpl(mediator,"4");

        mediator.addUser(user1);
        mediator.addUser(user3);
        mediator.addUser(user2);
        mediator.addUser(user4);

        user1.send("XD");

    }
}
