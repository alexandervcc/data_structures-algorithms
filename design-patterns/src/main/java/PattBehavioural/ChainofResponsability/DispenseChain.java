package PattBehavioural.ChainofResponsability;

public interface DispenseChain {
    void setNextChainObject(DispenseChain chain);
    void dispense(Currency cur);
}

class Dollar50Dispensor implements DispenseChain{
    private DispenseChain dc;

    @Override
    public void setNextChainObject(DispenseChain chain) {
        this.dc=chain;
    }

    @Override
    public void dispense(Currency cur) {
        if(cur.getAmount()>=50){
            int num= cur.getAmount()/50;
            int remainder=cur.getAmount()%50;
            System.out.println("Dispensing "+num+" 50$ note");

            if(remainder!=0){
                this.dc.dispense(new Currency(remainder));
            }
        }else {
            this.dc.dispense(cur);
        }
    }
}


class Dollar20Dispensor implements DispenseChain{
    private DispenseChain dc;

    @Override
    public void setNextChainObject(DispenseChain chain) {
        this.dc=chain;
    }

    @Override
    public void dispense(Currency cur) {
        if(cur.getAmount()>=20){
            int num= cur.getAmount()/20;
            int remainder=cur.getAmount()%20;
            System.out.println("Dispensing "+num+" 20$ note");

            if(remainder!=0){
                this.dc.dispense(new Currency(remainder));
            }
        }else {
            this.dc.dispense(cur);
        }
    }
}

class Dollar10Dispensor implements DispenseChain{
    private DispenseChain dc;

    @Override
    public void setNextChainObject(DispenseChain chain) {
        this.dc=chain;
    }

    @Override
    public void dispense(Currency cur) {
        if(cur.getAmount()>=10){
            int num= cur.getAmount()/10;
            int remainder=cur.getAmount()%10;
            System.out.println("Dispensing "+num+" 10$ note");

            if(remainder!=0){
                this.dc.dispense(new Currency(remainder));
            }
        }else {
            this.dc.dispense(cur);
        }
    }
}