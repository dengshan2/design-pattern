package comparator;

import java.util.Arrays;

/**
 *      《草》 作者：白居易
 *      离离原上草， 一岁一枯荣。
 *      野火烧不尽， 春风吹又生。
 *      远芳侵古道， 晴翠接荒城。
 *      又松王孙去， 萋萋满别情
 * Created by root on 11/23/15.
 * author: zd
 */
public class ArraysBasicTest {
    public static void main(String[] args) {
        testSortInteger();
        testSortChar();
    }

    public static void testSortInteger() {
        int[] data = {10, 9, 8, 2, 4, 1, 44, 99, 33, 12, 5};
        Arrays.sort(data);
        for (int i : data) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }

    public static void testSortChar() {
        char[] data = {'A', 'D', 'a', 'd', 'e', 'E', 'R', 'b', 'B'};
        Arrays.sort(data);
        for (char c : data) {
            System.out.print(c + ", ");
        }
        System.out.println();
    }



























}
