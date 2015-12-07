package designPattern.Visitor;

/**
 * Created by root on 10/28/15.
 */
public class MyVisitor implements Visitor {
    @Override
    public void visit(Subject subject) {
        System.out.println("the subject is : " + subject.getSubject());
    }
}
