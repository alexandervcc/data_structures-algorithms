package PattStructural.Adapter.Adapter1;

public class TurkeyAdapter implements Duck{
    Turkey t;
    public TurkeyAdapter(Turkey t){
        this.t=t;
    }

    @Override
    public void quak() {
        t.gobble();
    }

    @Override
    public void fly() {
        for(int i=0;i<5;i++){
            t.fly();
        }
    }
}
