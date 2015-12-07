package comparator.sort;

/**
 * Created by root on 11/24/15.
 * author: zd
 */
public class MergeSort {
    private static int[] data = { 8, 16, 99, 732, 10, 1, 29, 66 };
    private static int[] data2 = new int[data.length];

    private static void print() {
        for (int i : data) {
            System.out.print(i + ", ");
        }
    }

    private static void mergeSort(int start, int end) {
        if (start < end) {
            int pos = (start + end) / 2;
            mergeSort(start, pos);
            mergeSort(pos + 1, end);
            merge(start, pos, end);
        }
    }

    private static void merge(int start, int pos, int end) {
        int len1 = pos - start + 1;
        int len2 = end - pos;
        int[] A = new int[len1];
        int[] B = new int[len2];
        System.arraycopy(data, start - 1, A, 0, len1);
        System.arraycopy(data, pos, B, 0, len1);
        int m = 0, n = 0;
        int k = 0;
        while (m < len1 && n < len2) {
            if (A[m] < B[n]) {
                data[start - 1 + k++] = A[m++];
            } else {
                data[start - 1 + k++] = B[n++];
            }
        }
        while (m < len1) {
            data[start - 1 + k++] = A[m++];
        }
        while (n < len2) {
            data[start - 1 + k++] = B[n++];
        }
    }

    public static void main(String[] args) {
        print();
        System.out.println();
        mergeSort(1, data.length);
        print();
    }
}
