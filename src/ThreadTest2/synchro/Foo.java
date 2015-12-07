package ThreadTest2.synchro;

/**
 * 《春晓》作者： 孟浩然
 *     春棉不觉晓，处处闻啼鸟。
 *     夜来风雨声，花落知多少
 * Created by root on 11/5/15.
 * author: zd
 */
public class Foo {
    private int x = 100;

    public int getX() {
        return x;
    }

    public int fix(int y) {
        x = x - y;
        return x;
    }
}
