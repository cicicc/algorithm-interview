package cn.algorithm.sword.finger.offer;

/**
 * @Description 剑指offer: 在二维数组中查找指定数
 * 题目 ：
 * 在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 * <p>
 * 解题思路：
 * 从数组的右上角开始查找，即array[0][array[0].length-1],对于这个数来说，其左边的数都比他小，其下的数都比它大
 * 如果要查找的数大于此位置值，那么向下查找，如果要查找的数小于此位置值，那么向左查找
 * <p>
 * 复杂度分析：
 * 时间复杂度 O(M+N),空间复杂度O(1)
 * @Author: HaiBo Chen
 * @Date: 2020/2/18
 * @Time: 5:33 下午
 */
public class FindNumberInArray {

    public static boolean find(int target, int[][] array) {
        if (array == null || array.length == 0 ||
                array[0] == null || array[0].length == 0) {
            return false;
        }

        if (array[array.length - 1][array[0].length - 1] < target || array[0][0] > target) {
            return false;
        }

        int i = 0;
        int j = array[0].length - 1;

        while (i < array.length && j >= 0) {
            if (array[i][j] == target) {
                return true;
            } else if (array[i][j] > target) {
                --j;
            } else {
                ++i;
            }

        }
        return false;

    }

    public static void main(String[] args) {
        int[][] test = {{1, 2, 8, 9}, {2, 4, 9, 12}, {4, 7, 10, 13}, {6, 8, 11, 15}};
        System.out.println(FindNumberInArray.find(5, test));
    }
}
