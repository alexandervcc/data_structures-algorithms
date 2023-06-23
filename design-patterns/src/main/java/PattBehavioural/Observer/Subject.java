package PattBehavioural.Observer;

import java.util.ArrayList;
import java.util.List;

public interface Subject {
    void registerObject(Observer obj);
    void unregisterObject(Observer obj);
    void notifyObservers();
    //method to get updates from observers, to use query
    String getUpdate(Observer obj);
    void postMessage(String msg);
}

class SubjectConcrete implements Subject{
    private List<Observer> observerList;
    private String message;
    private boolean change;

    public SubjectConcrete(){
        this.observerList=new ArrayList<Observer>();
    }

    //change state (trigger a notification)
    @Override
    public void postMessage(String msg){
        System.out.println("Message Posted: "+this.message);
        this.message=msg;
        this.change=true;
        notifyObservers();
    }

    @Override
    public void registerObject(Observer obj) {
        if(obj==null)throw  new NullPointerException("Null Observer");
        if(!this.observerList.contains(obj))this.observerList.add(obj);
    }

    @Override
    public void unregisterObject(Observer obj) {
        this.observerList.remove(obj);
    }

    @Override
    public void notifyObservers() {
        List<Observer> localList=null;
        if(!change)return;

        //copy, avoid race conditions
        localList = new ArrayList<>(this.observerList);
        this.change=false;

        for(Observer obj:localList){
            obj.update();
        }
    }

    @Override
    public String getUpdate(Observer obj) {
        return this.message;
    }


}