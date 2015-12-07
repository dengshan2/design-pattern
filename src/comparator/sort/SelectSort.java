package comparator.sort;

/**
 * Created by root on 11/23/15.
 * author: zd
 */
public class SelectSort {
    static int[] data = {6, 3, 8, 5, 4, 2, 7, 1, 10, 9};

    static void selectSort() {
        int i , j, k, tmp;
        for (i = 0; i < data.length - 1; i++) {
            k = i;
            for (j = i + 1; j < data.length; j++)
                if (data[j] < data[k])
                    k = j;
            if (k != i) {
                tmp = data[i];
                data[i] = data[k];
                data[k] = tmp;
            }
        }
    }

    static void print() {
        for (int i : data) {
            System.out.print(i + ", ");
        }
    }

    public static void main(String[] args) {
        print();
        System.out.println();
        selectSort();
        print();
    }
}
