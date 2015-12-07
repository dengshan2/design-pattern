package Exception;

/**
 * Created by root on 10/13/15.
 */
public class TestException4 {
    public static void main(String[] args) {
        int i = 0;
        String[] array = new String[] {"Hello World!", "Hello World!!", "Hello World!!!"};
        while (i < 4) {
            try {
                System.out.println(array[i++]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("数组下标越界异常！");
            } finally {
                System.out.println("----------------------");
            }
        }
    }
}
