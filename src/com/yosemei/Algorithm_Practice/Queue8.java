package com.agent;

/**
 * Created by root on 9/9/15.
 */
public class Queue8 {
    private int num = 0;
    private final int MAXQUEEN = 8;
    private int[] cols = new int[MAXQUEEN];

    public Queue8() {
        // 核心函数
        getArrangement(0);
        System.out.println(MAXQUEEN + "皇后问题有" + num + "种摆放方法。");
    }

    public void getArrangement(int n) {
        boolean[] rows = new boolean[MAXQUEEN];
        for (int i = 0; i < n; i++) {
            rows[cols[i]] = true;
            int d = n - i;
            if (cols[i]-d >= 0) {
                rows[cols[i] - d] = true;
            }
            if (cols[i]+d <= MAXQUEEN-1) {
                rows[cols[i] + d] = true;
            }
        }
        for (int i = 0; i < MAXQUEEN; i++) {
            if (rows[i]) continue;
            cols[n] = i;
            if (n < MAXQUEEN-1) {
                getArrangement(n+1);
            } else {
                num++;
                printChessBoard();
            }
        }
    }

    public void printChessBoard() {
        System.out.println("第" + num + "种走法");
        for (int i = 0; i < MAXQUEEN; i++) {
            for (int j = 0; j < MAXQUEEN; j++) {
                if (i == cols[j]) {
                    System.out.print("0 ");
                } else {
                    System.out.print("+ ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Queue8();
    }
}
