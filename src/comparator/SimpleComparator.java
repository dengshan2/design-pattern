package comparator;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by root on 11/20/15.
 * author: zd
 */
public class SimpleComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        return toInt(o1) - toInt(o2);
    }

    private int toInt(Object o) {
        String str = (String)o;
        str = str.replaceAll("一", "1");
        str = str.replaceAll("二", "2");
        str = str.replaceAll("三", "3");
        return Integer.parseInt(str);
    }

    public static void main(String[] args) {
        String[] arr = new String[]{"一二", "一", "二"};
        Arrays.sort(arr, new SimpleComparator());
        for (String str : arr) {
            System.out.println(str);
        }
    }
}
