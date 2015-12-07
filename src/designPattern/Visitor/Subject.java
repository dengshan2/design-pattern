package designPattern.Visitor;

/**
 * Created by root on 10/28/15.
 */
public interface Subject {
    public void accept(Visitor visitor);

    public String getSubject();
}
