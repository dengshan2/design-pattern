package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by root on 11/23/15.
 * author: zd
 */
public class Test3 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>();
        list.add(5);
        list.add(2);
        list.add(1);
        list.add(9);
        list.add(0);

        System.out.println("原序列:");
        for (Integer integer : list) {
            System.out.print(integer+" ");
        }
        System.out.println();

        /*根据步长进行循环*/
        Collections.rotate(list, 1);
        System.out.println("循环后:");
        for (Integer integer : list) {
            System.out.print(integer+" ");
        }
    }


//    public static void main(String[] args) {
//        int[] data = new int[]{2, 5, 2, 3, 5, 2, 3, 5, 2, 3, 5, 2, 3, 5, 2,
//                        7, 8, 8, 7, 8, 7, 9, 0};
//        Map<Integer, Integer> map = new HashMap<>();
//        for (Integer i : data) {
//            if (map.containsKey(i)) {
//                map.put(i, map.get(i) + 1);
//            } else {
//                map.put(i, 1);
//            }
//        }
//        for (Integer i : map.values()) {
//            System.out.println(i);
//        }
//        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
//        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
//            @Override
//            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
//                return o2.getValue() - o1.getValue();
//            }
//        });
//        for (Map.Entry<Integer, Integer> i : list) {
//            System.out.println(i.getKey() + " : " + i.getValue());
//        }
//    }
}
