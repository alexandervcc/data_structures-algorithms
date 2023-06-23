package PattBehavioural.Interpreter.Ex02;

public class Client {

    public static Expression getMaleExp(){
        Expression babas=new TerminalExpression("Babas");
        Expression mijotron=new TerminalExpression("Mijotron");
        return new OrExpression(babas,mijotron);
    }

    public static Expression getDogsExp(){
        Expression mana=new TerminalExpression("Mana");
        Expression dog=new TerminalExpression("Dog");
        return new AndExpression(mana,dog);
    }

    public static void main(String[] args) {
        Expression isMale =getMaleExp();
        Expression isDog = getDogsExp();

        Context context= new Context("Babas");
        System.out.println("Babas is Male??" +isMale.interpret(context) );

        Context context1= new Context("Mana Dog");
        System.out.println("Mana is a dog??"+isDog.interpret(context1));

        Context context2=new Context("Mana");
        System.out.println("Is Mana Male???: "+isMale.interpret(context2 ));
    }
}
