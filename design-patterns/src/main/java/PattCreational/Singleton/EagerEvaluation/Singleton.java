package PattCreational.Singleton.EagerEvaluation;

public class Singleton {
    //Private reference, to one and only instance
    private volatile static Singleton unique=new Singleton();

    //Instance atribute
    private int data=0;

    //Private Constructor, noobody can instantiate it
    private Singleton(){    }

    //Method to get Reference, synchronized. Thread Safe
    public static Singleton getInstance(){
        return unique;
    }

    public void setData(int data){
        this.data=data;
    }

    public void printData(){
        System.out.println("Counter: "+this.data);
    }
}