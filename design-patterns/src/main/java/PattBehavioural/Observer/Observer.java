package PattBehavioural.Observer;

public interface Observer {
    //update objects, used by subject
    void update();
    //atach subject to the observer, to query updates
    void setSubject(Subject subject);
}

class ConcreteObserver implements  Observer{
    private String name;
    private Subject subject;

    public ConcreteObserver(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        String msg= (String) subject.getUpdate(this);
        if(msg==null){
            System.out.println(name+" :: No new Message");
        }else {
            System.out.println(name+" :: Consuming Message: "+msg);
        }
    }

    @Override
    public void setSubject(Subject subject) {
        this.subject=subject;
    }
}