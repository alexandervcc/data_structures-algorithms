package PattCreational.Singleton.Lazy;

public class Client {
    public static void main(String[] args) {
        Singleton ref=Singleton.getInstance();
        ref.setData(100);
        ref.printData();
        Singleton ref2=Singleton.getInstance();
        ref.setData(1000);
        ref2.printData();
        ref.printData();


    }
}
