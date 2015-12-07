package comparator.sort;

/**
 * Created by root on 11/23/15.
 * author: zd
 */
public class InsertSort {
    static int[] data = {6, 3, 8, 5, 4, 2, 7, 1, 10, 9};

    static void insertSort2() {
        int len = data.length;
        int j;
        for (int i = 1; i < len; i++) {
            for (j = i - 1; j >= 0; j--) {
                if (data[j] < data[i])
                    break;
            }
            if (j != i - 1) {
                int tmp = data[i];
                int k = i - 1;
                while (k > j) {
                    data[k+1] = data[k];
                    k--;
                }
                data[k+1] = tmp;
            }
        }
    }

    static void insertSort3() {
        int len = data.length;
        for (int i = 1; i < len; i++) {
            if (data[i] < data[i-1]) {
                int temp = data[i];
                int j;
                for (j = i - 1; j >= 0 && data[j] > temp; j--) {
                    data[j+1] = data[j];
                }
                data[j+1] = temp;
            }
        }
    }

    static void insertSort4() {
        int len = data.length;
        for (int i = 1; i < len; i++) {
            for (int j = i - 1; j >= 0 && data[j] > data[j+1]; j--) {
                int temp = data[j+1];
                data[j+1] = data[j];
                data[j] = temp;
            }
        }
    }

    static void insertSort() {
        int temp, j;
        for (int k = 0; k < data.length; k++) {
            temp = data[k];
            j = k - 1;
            while (j >= 0 && data[j] > temp) {
                data[j+1] = data[j];
                j--;
            }
            data[j+1] = temp;
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
        insertSort4();
        print();
        System.out.println();
    }
}
