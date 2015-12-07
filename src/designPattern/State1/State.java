package designPattern.State1;

/**
 * Created by root on 10/27/15.
 */
public class State {
    private String value;

    public State() {
    }

    public State(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void mehtod1() {
        System.out.println("execute the first opt!");
    }

    public void method2() {
        System.out.println("execute the second opt!");
    }
}
