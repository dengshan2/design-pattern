package Exception;

/**
 * Created by root on 10/13/15.
 */
public class MyException extends Exception {
    private String message;

    public MyException(String ErrorMessage) {
        this.message = ErrorMessage;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
