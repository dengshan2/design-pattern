package designPattern.State1;

/**
 * Created by root on 10/27/15.
 */
public class Context {
    private State state;

    public Context(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void method() {
        if ("State1".equals(state.getValue())) {
            state.mehtod1();
        } else if ("State2".equals(state.getValue())) {
            state.method2();
        } else {
            System.out.println("not the right opt!");
        }
    }
}
