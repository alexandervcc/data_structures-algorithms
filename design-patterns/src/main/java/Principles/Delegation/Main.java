package Principles.Delegation;

class Printer{
    //The Delegator
    private RealPrinter rp=new RealPrinter();

    //Principles.Delegation method
    void print(){
        rp.print();
    }
}

class RealPrinter{
    //Delegated

    void print(){
        System.out.println("Delegate");
    }
}


public class Main {
    public static void main(String[] args) {
        Printer p=new Printer();


        p.print();
    }
}
