package designPattern.Interpreter;

/**
 * Created by root on 10/29/15.
 */
public class Plus implements Expression {
    @Override
    public int interpret(Context context) {
        return context.getNum1() + context.getNum2();
    }
}
