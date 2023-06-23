package PattBehavioural.Interpreter.Ex01;

public class Context {
    public String getBinaryFormat (int i){
        return Integer.toBinaryString(i);
    }
    public String getHexdFormat (int i){
        return Integer.toHexString(i);
    }
}
