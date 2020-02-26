package cn.algorithm.junior.lesson1;

/**
 * @Description 冒泡排序
 * 思路：
 * 每次把最大的值放在未排序数据的最后一位
 * <p>
 * 时间/空间复杂度：
 * 时间复杂度：O(n2),空间复杂度 O(1)
 * <p>
 * 注意：
 * 冒泡排序是一种稳定排序
 * @Author: HaiBo Chen
 * @Date: 2020/2/26
 * @Time: 11:29 上午
 */
public class BubbleSort {

    public static void bubbleSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

}
