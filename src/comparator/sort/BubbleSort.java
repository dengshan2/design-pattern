package comparator.sort;

/**
 * Created by root on 11/23/15.
 * author: zd
 */
public class BubbleSort {
    static int[] data = {20, 3, 10, 9, 186, 99, 200, 96, 3000};

    static void print() {
        for (int i : data) {
            System.out.print(i + ", ");
        }
    }

    static void bubbleSort() {
        int i, j, temp;
        for (i = 0; i < data.length; i++) {
            for (j = data.length - 1; j > i; j--) {
                if (data[j-1] > data[j]) {
                    temp = data[j];
                    data[j] = data[j-1];
                    data[j-1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        print();
        System.out.println();
        bubbleSort();
        print();
    }
}
