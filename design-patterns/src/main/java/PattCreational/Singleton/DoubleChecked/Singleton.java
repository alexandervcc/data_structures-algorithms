package PattCreational.Singleton.DoubleChecked;


public class Singleton {
    //Private reference, to one and only instance
    private volatile static Singleton unique=null;

    //Instance atribute
    private int data=0;

    //Private Constructor, noobody can instantiate it
    private Singleton(){    }

    //Method to get Reference, synchronized. Thread Safe
    public static Singleton getInstance(){
        if(unique==null){
            //Happens only in this place, where happens only one time
            synchronized (Singleton.class) {
                unique = new Singleton();
            }
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
