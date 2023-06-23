package PattBehavioural.Interpreter.Ex01;

public class Client {
    public Context ic;

    public Client (Context c){
        this.ic=c;
    }

    public String interpret(String str){
        Expression exp=null;
        if(str.contains("H")){
            exp=new IntToBinaryExp(Integer.parseInt(str.substring(2,str.length())));
        }else if (str.contains("B")){
            exp=new IntToHexdExp(Integer.parseInt(str.substring(2,str.length())));
        }else {
            return str;
        }
        return exp.interpret(ic);
    }

    public static void main(String[] args) {
        String st1="B 28";
        String st2="H 28";

        Client client = new Client(new Context());
        System.out.println(st1+" = "+client.interpret(st1));
        System.out.println(st2+" = "+client.interpret(st2));


    }
}
