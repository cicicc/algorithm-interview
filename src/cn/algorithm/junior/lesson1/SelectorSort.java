package cn.algorithm.junior.lesson1;

import java.util.Arrays;

/**
 * @Description 选择排序
 * 思路：
 * 每次查询数组中未排序部分最小的数，将其放在数组中排序部分的最后
 * 时间/空间复杂度
 * 时间复杂度O(n2),空间复杂度O(1)
 * @Author: HaiBo Chen
 * @Date: 2020/2/26
 * @Time: 9:35 下午
 */
public class SelectorSort {

    public static void selectorSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            int minDataIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minDataIndex]) {
                    minDataIndex = j;
                }
                int temp = arr[i];
                arr[i] = arr[minDataIndex];
                arr[minDataIndex] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    


}
