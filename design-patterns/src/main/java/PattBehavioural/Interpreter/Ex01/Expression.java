package PattBehavioural.Interpreter.Ex01;

public interface Expression {
    String interpret(Context ic);
}

class IntToBinaryExp implements Expression{
    private int i;

    public IntToBinaryExp(int i) {
        this.i = i;
    }

    @Override
    public String interpret(Context ic) {
        return ic.getBinaryFormat(i);
    }
}

class IntToHexdExp implements Expression{
    private int i;

    public IntToHexdExp(int i) {
        this.i = i;
    }

    @Override
    public String interpret(Context ic) {
        return ic.getHexdFormat(i);
    }
}