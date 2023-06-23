package PattBehavioural.State;

public class TvContext {
    private RemoteControl state;

    public TvContext(RemoteControl state) {
        this.state = state;
    }

    public void pressButton(){
        this.state.pressSwitch(this);
    }

    public RemoteControl getState() {
        return state;
    }

    public void setState(RemoteControl state) {
        this.state = state;
    }
}
