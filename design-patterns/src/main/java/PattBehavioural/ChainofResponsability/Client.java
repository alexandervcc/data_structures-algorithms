package PattBehavioural.ChainofResponsability;

public class Client {
    private DispenseChain dispenseChain;

    public Client(){
        this.dispenseChain=new Dollar50Dispensor();
        DispenseChain d20=new Dollar20Dispensor();
        DispenseChain d10=new Dollar10Dispensor();

        this.dispenseChain.setNextChainObject(d20);
        d20.setNextChainObject(d10);

    }

    public void dispense(Currency amount){
        this.dispenseChain.dispense(amount);
    }

    public static void main(String[] args) {
        Client dispenser=new Client();
        int amount=70;

        dispenser.dispense(new Currency(80));
    }
}
