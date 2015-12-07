package Exception;

/**
 * Created by root on 10/13/15.
 */
public class TestException1 {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
//        try {
//            if (b == 0)
//                throw new ArithmeticException();

        System.out.println("a/b 的值是： " + a / b);
//        } catch (ArithmeticException e) {
//            System.out.println("程序出现异常，除数不能为0 ！");
//        }
        System.out.println("程序正常结束");
    }
}
