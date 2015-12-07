package designPattern.State1;

/**
 * Created by root on 10/27/15.
 */
public class Test {
    public static void main(String[] args) {
        State state = new State();
        Context context = new Context(state);

        state.setValue("State1");
        context.method();

        state.setValue("State2");
        context.method();

        state.setValue("State");
        context.method();
    }
}
