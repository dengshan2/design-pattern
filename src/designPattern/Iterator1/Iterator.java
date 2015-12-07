package designPattern.Iterator1;

/**
 * Created by root on 10/21/15.
 * author: zd
 */
public interface Iterator {
    /* 前移 */
    public Object previous();

    /* 后移 */
    public Object next();
    public boolean hasNext();

    /* 取得第一个 */
    public Object first();
}
