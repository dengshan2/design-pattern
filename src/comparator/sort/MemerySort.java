package comparator.sort;

/**
 * Created by root on 11/23/15.
 * author: zd
 */
public class MemerySort {
    static int[] data1 = { 2, 7, 8, 10, 299 };
    static int[] data2 = { 5, 9, 14, 20, 66, 88, 92 };
    static int[] data = new int[data1.length + data2.length];

    static void print() {
        for (int i : data) {
            System.out.print(i + ", ");
        }
    }

    static void memerySort() {
        int m = data1.length;
        int n = data2.length;
        int i, j, k;
        i = j = k = 0;
        while (i < m && j < n) {
            if (data1[i] < data2[j]) {
                data[k++] = data1[i++];
            } else {
                data[k++] = data2[j++];
            }
        }
        while (i < m) {
            data[k++] = data1[i++];
        }
        while (j < n) {
            data[k++] = data2[j++];
        }
    }

    public static void main(String[] args) {
        print();
        System.out.println();
        memerySort();
        print();
        System.out.println();
        System.out.println(data1.length);
        System.out.println(data2.length);
        System.out.println(data.length);
    }
}
