package designPattern.Bridge;

/**
 * Created by root on 10/12/15.
 */
public abstract class Bridge {
    private SourceAble source;

    public void method() {
        source.method();
    }

    public SourceAble getSource() {
        return source;
    }

    public void setSource(SourceAble source) {
        this.source = source;
    }
}
