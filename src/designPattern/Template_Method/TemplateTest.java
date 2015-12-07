package designPattern.Template_Method;

/**
 * Created by root on 10/20/15.
 */
public class TemplateTest {
    public static void main(String[] args) {
        String exp = "8+2";
        AbstractCalculator ac = new Plus();
        int result = ac.calculate(exp, "\\+");
        System.out.println(result);
    }
}
