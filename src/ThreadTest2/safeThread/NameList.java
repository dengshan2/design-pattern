package ThreadTest2.safeThread;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * 《相思》 作者： 王维
 *      红豆生南国，春来发几枝。
 *      愿君多采撷，此物最相思。
 * Created by root on 11/5/15.
 * author: zd
 */
public class NameList {
    private List<String> nameList = Collections.synchronizedList(new LinkedList<String>());

    public void add(String name) {
        nameList.add(name);
    }

    public synchronized String removeFirst() {
        if (nameList.size() > 0) {
            return nameList.remove(0);
        } else {
            return null;
        }
    }
}
