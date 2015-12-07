package designPattern.Bridge;

/**
 * Created by root on 10/12/15.
 */
public class Client {
    public static void main(String[] args) {
        Bridge bridge = new MyBridge();

        /* 调用第一个对象 */
        SourceAble source1 = new SourceSub1();
        bridge.setSource(source1);
        bridge.method();

        /* 调用第二个对象 */
        SourceAble source2 = new SourceSub2();
        bridge.setSource(source2);
        bridge.method();
    }
}
