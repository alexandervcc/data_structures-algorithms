package PattStructural.Adapter.Adapter1;

public class Client {
    public static void main(String[] args) {
        Duck md=new MallardDuck();
        Turkey wt =new WildTurkey();

        Duck tAdapter=new TurkeyAdapter(wt);

        System.out.println("Turkey");
        wt.fly();
        wt.gobble();
        System.out.println("Duck");
        md.fly();
        md.quak();
        System.out.println("Adapter");
        tAdapter.fly();
        tAdapter.quak();

    }


}
