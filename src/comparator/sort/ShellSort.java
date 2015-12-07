package comparator.sort;

/**
 *      《游子吟》 作者： 孟郊
 *      慈母手中线， 游子身上衣。
 *      临行密密缝， 意恐迟迟归。
 *      谁言寸草心， 报得三春晖。
 * Created by root on 11/24/15.
 * author: zd
 */
public class ShellSort {
    private static int[] data = {49, 38, 65, 97, 26, 13, 27, 49, 55, 4};

    private static void shellSort() {
        int n = data.length;
        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = 0; i < gap; i++) {
                for (int j = i + gap; j < n; j += gap) {
                    if (data[j] < data[j-gap]) {
                        int temp = data[j];
                        int k = j - gap;
                        while (k >= 0 && data[k] > temp) {
                            data[k+gap] = data[k];
                            k -= gap;
                        }
                        data[k+gap] = temp;
                    }
                }
            }
        }
    }

    private static void shellSort2() {
        int n = data.length;
        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int j = gap; j < n; j+=gap) {
                if (data[j] < data[j-gap]) {
                    int temp = data[j];
                    int k = j - gap;
                    while (k >= 0 && data[k] > temp) {
                        data[k+gap] = data[k];
                        k -= gap;
                    }
                    data[k+gap] = temp;
                }
            }
        }
    }

    private static void print() {
        for (int i : data) {
            System.out.print(i + ", ");
        }
    }

    public static void main(String[] args) {
        print();
        System.out.println();
        shellSort2();
        print();
    }
}
