package PattBehavioural.Observer;

public class Client {
    public static void main(String[] args) {
        Subject subject=new SubjectConcrete();

        Observer obj1=new ConcreteObserver("Obj1 ");
        Observer obj2=new ConcreteObserver("Obj2 ");
        Observer obj3=new ConcreteObserver("Obj3 ");

        subject.registerObject(obj1);
        subject.registerObject(obj2);
        subject.registerObject(obj3);

        obj1.setSubject(subject);
        obj2.setSubject(subject);
        obj3.setSubject(subject);

        //Check if updates are available
        obj1.update();

        //Send message to subjec
        subject.postMessage("Test Message 1");

    }
}
