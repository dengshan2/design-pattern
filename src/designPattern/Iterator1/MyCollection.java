package designPattern.Iterator1;

/**
 * Created by root on 10/21/15.
 */
public class MyCollection implements Collection{
    private String[] array = new String[]{"A", "B", "C", "D", "E"};

    @Override
    public Iterator iterator() {
        return new MyIterator(this);
    }

    @Override
    public Object get(int i) {
        return array[i];
    }

    @Override
    public int size() {
        return array.length;
    }
}
