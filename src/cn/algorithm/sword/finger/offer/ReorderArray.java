package cn.algorithm.sword.finger.offer;

/**
 * @Description 调整数组顺序使奇数位于偶数前面
 * 题目：
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，
 * 并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 * 此处没有限制空间复杂度，可以先计算数组中的奇数个数，然后申请额外空间进行
 * @Author: HaiBo Chen
 * @Date: 2020/3/4
 * @Time: 12:44 上午
 */
public class ReorderArray {

    public static void reOrderArray(int[] array) {
        if (array == null || array.length <= 1) {
            return;
        }
        int oddNumber = 0;
        for (int item : array) {
            if (item % 2 == 1) {
                oddNumber++;
            }
        }
        int[] codeArray = array.clone();
        int oddPoint = 0;
        int evenPoint = oddNumber;
        for (int value : codeArray) {
            if (value % 2 == 1) {
                array[oddPoint++] = value;
            } else {
                array[evenPoint++] = value;
            }
        }

    }

}
