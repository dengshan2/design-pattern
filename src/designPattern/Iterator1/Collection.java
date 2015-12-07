package designPattern.Iterator1;

/**
 * Created by root on 10/21/15.
 */
public interface Collection {
    public Iterator iterator();

    /* 取得集合元素 */
    public Object get(int i);

    /* 取得集合元素大小 */
    public int size();
}
