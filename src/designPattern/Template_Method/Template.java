package designPattern.Template_Method;

/**
 * Created by root on 10/20/15.
 */
public abstract class Template {
    private void beforeOperation() {
        System.out.println("This action before the operation!");
    }

    private void afterOperation() {
        System.out.println("This action after the operation!");
    }

    /* 需要推迟到子类中去执行 */
    abstract protected void operation();

    public void topOperation() {
        beforeOperation();
        operation();
        afterOperation();
    }
}
