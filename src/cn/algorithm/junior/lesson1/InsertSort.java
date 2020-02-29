package cn.algorithm.junior.lesson1;

import java.util.Arrays;

/**
 * @Description 插入排序
 * 思路：
 * 对于未排序数据，在已排序序列中从后向前扫描，找到相应位置并插入
 * 时间/空间复杂度
 * 时间复杂度O(n2)， 空间复杂度O(1)
 * @Author: HaiBo Chen
 * @Date: 2020/2/26
 * @Time: 11:52 下午
 */
public class InsertSort {

    public static void insertSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0 && arr[j] < arr[j - 1]; j--) {
                int temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
            }

        }

    }

}
