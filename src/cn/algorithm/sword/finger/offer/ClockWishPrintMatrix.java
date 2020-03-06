package cn.algorithm.sword.finger.offer;

import java.util.ArrayList;

/**
 * @Description 顺时针打印矩阵
 * 题目：
 * 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，
 * 例如，如果输入如下4 X 4矩阵： 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
 * @Author: HaiBo Chen
 * @Date: 2020/3/6
 * @Time: 4:45 下午
 */
public class ClockWishPrintMatrix {

    public static ArrayList<Integer> printMatrix(int[][] matrix) {
        ArrayList<Integer> resultList = new ArrayList<>();
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return resultList;
        }

        int r1 = 0;
        int r2 = matrix.length - 1;
        int c1 = 0;
        int c2 = matrix[0].length - 1;

        while (c1 <= c2 && r1 <= r2) {
            for (int i = c1; i <= c2; i++) {
                resultList.add(matrix[r1][i]);
            }
            for (int i = r1 + 1; i <= r2; i++) {
                resultList.add(matrix[i][c2]);
            }
            for (int i = c2 - 1; i >= c1 && r1 != r2; i--) {
                resultList.add(matrix[r2][i]);
            }
            for (int i = r2 - 1; i >= r1 + 1 && c1 != c2; i--) {
                resultList.add(matrix[i][c1]);
            }

            r1++;
            c1++;
            r2--;
            c2--;


        }


        return resultList;

    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4, 5}};
        System.out.println(printMatrix(matrix));
    }

}
