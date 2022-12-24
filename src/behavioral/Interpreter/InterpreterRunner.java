package behavioral.Interpreter;

public class InterpreterRunner {
    public static void main(String[] args) {
        Expression isDonerMaster = getDonerExpression();
        Expression isDonerDurumMaster = getDonerDurumExpression();

        System.out.println("Does Kebab Man know how to doing doner? " + isDonerMaster.interpret("doner"));
        System.out.println("Does Kebab Man know how to doing durum? " + isDonerDurumMaster.interpret("durum doner"));

    }

    public static Expression getDonerExpression(){
        Expression doner = new TerminalExpression("doner");
        Expression bigDoner = new TerminalExpression("big doner");

        return new OrExpression(doner, bigDoner);
    }
    public static Expression getDonerDurumExpression(){
        Expression doner = new TerminalExpression("doner");
        Expression durum = new TerminalExpression("durum");

        return new AndExpression(doner, durum);
    }
}
