package Exception;

/**
 * Created by root on 10/13/15.
 */
public class TestException5 {
    public static void main(String[] args) {
        try {
            int a = 2;
            int b = -1;
            quotient(a, b);
        } catch (MyException e) {
            System.out.println(e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("除数不能为零！");
        } catch (Exception e) {
            System.out.println("程序发生了其它异常！");
        }
    }

    public static int quotient(int x, int y) throws MyException {
        if (y < 0) {
            throw new MyException("除数不能为负数！");
        }
        return x/y;
    }
}
