package designPattern.Chain_Of_Responsibility;

/**
 * Created by root on 10/22/15.
 */
public class AbstractHandler {
    private Handler handler;

    public Handler getHandler() {
        return handler;
    }

    public void setHandler(Handler handler) {
        this.handler = handler;
    }
}
