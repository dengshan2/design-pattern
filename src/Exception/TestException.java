package Exception;

/**
 * Created by root on 10/13/15.
 */
public class TestException {
    public TestException() {

    }

    public boolean testEx() throws Exception {
        boolean ret = true;
        try {
            ret = testEx1();
        } catch (Exception e) {
            System.out.println("testEx, catch exception!");
            ret = false;
            throw e;
        } finally {
            System.out.println("testEx, finally; value = " + ret);
        }
        return ret;
    }

    public boolean testEx1() throws Exception {
        boolean ret = true;
        try {
            ret = testEx2();
            if (!ret) {
                return false;
            }
            System.out.println("testEx1, at the end of try!");
            return true;
        } catch (Exception e) {
            System.out.println("testEx1, catch exception!");
            ret = false;
            throw e;
        } finally {
            System.out.println("testEx1, finally; value = " + ret);
        }
    }

    public boolean testEx2() throws Exception {
        boolean ret = true;
        try {
            int b = 12;
            int c;
            for (int i = 2; i >= -2; i--) {
                c = b / i;
                System.out.println(c);
                System.out.println("i = " + i);
            }
        } catch (Exception e) {
            System.out.println("testEx2, catch exception!");
            ret = false;
            throw e;
        } finally {
            System.out.println("testEx2, finally; return value = " + ret);
        }
        return ret;
    }

    public static void main(String[] args) {
        TestException test = new TestException();
        try {
            test.testEx();
        } catch (Exception e) {
//            e.printStackTrace();
        }
    }
}
