package designPattern.Template_Method;

/**
 * Created by root on 10/20/15.
 * author: zd
 */
public class TemplateImpl extends Template {
    @Override
    protected void operation() {
        System.out.println("The operation action is executed in the method of ServiceA instance!");
    }
}
