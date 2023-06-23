package PattCreational.Singleton.Synchornized;

public class Singleton {
    //Private reference, to one and only instance
    private static Singleton unique=null;

    //Instance atribute
    private int data=0;

    //Private Constructor, noobody can instantiate it
    private Singleton(){    }

    //Method to get Reference, synchronized. Thread Safe
    public static synchronized Singleton getInstance(){
        if(unique==null){
            unique=new Singleton();
        }
        return unique;
    }

    public void setData(int data){
        this.data=data;
    }

    public void printData(){
        System.out.println("Counter: "+this.data);
    }
}