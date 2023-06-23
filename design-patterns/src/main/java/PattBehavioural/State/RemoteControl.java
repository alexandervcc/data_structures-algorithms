package PattBehavioural.State;

public abstract class RemoteControl {
    public abstract void pressSwitch(TvContext context);
}

class OnTv extends RemoteControl{
    @Override
    public void pressSwitch(TvContext context) {
        System.out.println("ON  -> Going OFF");
        context.setState(new OffTv());
    }
}

class OffTv extends RemoteControl{
    @Override
    public void pressSwitch(TvContext context) {
        System.out.println("OFF -> Going ON");
        context.setState(new OnTv());
    }
}
