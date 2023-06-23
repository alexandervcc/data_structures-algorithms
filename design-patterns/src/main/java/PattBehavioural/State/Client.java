package PattBehavioural.State;

public class Client {
    public static void main(String[] args) {
        OffTv initialState = new OffTv();
        TvContext tv=new TvContext(initialState);

        tv.pressButton();
        tv.pressButton();
        tv.pressButton();
        tv.pressButton();

    }
}
