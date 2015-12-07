package Exception;

/**
 * Created by root on 10/13/15.
 */
public class TestException2 {
    public static void pop() throws NegativeArraySizeException {
        int[] array = new int[-3];
    }

    public static void main(String[] args) {
        try {
            pop();
        } catch (Exception e) {
            System.out.println("pop方法抛出的异常！");
        }
        System.out.println("haha");
    }
}
