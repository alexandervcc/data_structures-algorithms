package PattCreational.Singleton.BillPugh;

public class Singleton {
    //Instance atribute
    private int data=0;

    //Private Constructor, noobody can instantiate it
    private Singleton(){    }

    //Method to get Reference, synchronized. Thread Safe
    public static Singleton getInstance(){
        return SingletonHelper.unique;
    }

    public void setData(int data){
        this.data=data;
    }

    public void printData(){
        System.out.println("Counter: "+this.data);
    }

    //Helper Inner Class - Nested
    //Reference afte getInstace() is called
    private static class SingletonHelper{
        private static final Singleton unique=new Singleton();
    }
}
