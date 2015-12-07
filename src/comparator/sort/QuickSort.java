package comparator.sort;

/**
 * Created by root on 11/23/15.
 * author: zd
 */
public class QuickSort {
    static int[] data = {20, 3, 10, 9, 186, 99, 200, 96, 3000};

    static void print() {
        for (int i : data) {
            System.out.print(i + ", ");
        }
    }

    static void quickSort(int low, int high) {
        if (low < high) {
            int result = partition(low, high);
            quickSort(low, result - 1);
            quickSort(result + 1, high);
        }
    }

    static int partition(int low, int high) {
        int temp = data[low];
        while (low < high) {
            while (low < high && data[high] >= temp)
                high--;
            data[low] = data[high];
            while (low < high && data[low] <= temp)
                low++;
            data[high] = data[low];
        }
        data[low] = temp;
        return low;
    }

    public static void main(String[] args) {
        print();
        System.out.println();
        quickSort(0, data.length - 1);
        print();
    }
}
