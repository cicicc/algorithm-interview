package cn.algorithm.leetcode;

/**
 * @Description 合并两个有序数组
 * 题目描述:
 * 给你两个有序整数数组 nums1 和 nums2，请你将 nums2 合并到 nums1 中，使 num1 成为一个有序数组。
 * 说明:
 * 初始化 nums1 和 nums2 的元素数量分别为 m 和 n 。
 * 你可以假设 nums1 有足够的空间（空间大小大于或等于 m + n）来保存 nums2 中的元素。
 * 解题思路
 * 由于两个数组都是有序数组，那么使用两个指针指向两个数组的末尾，一个指针c指向数组1的第m+n（两个数组长度之和）位置，
 * 对指针指向元素判断大小，较大的放在指针c指向位置
 * 时间/空间复杂度
 * 时间复杂度 O（n+m）
 * 空间复杂度O(1)
 *
 * @Author: HaiBo Chen
 * @Date: 2020/3/17
 * @Time: 12:47 下午
 */
public class Merge2Array {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (nums2 == null || n <= 0) {
            return;
        }
        if (nums1 == null || m <= 0) {
            nums1 = nums2;
        }

        int mergePoint = m + n - 1;
        int num1Point = m - 1;
        int num2Point = n - 1;
        while (num1Point >= 0 && num2Point >= 0) {
            if (nums1[num1Point] > nums2[num2Point]) {
                nums1[mergePoint--] = nums1[num1Point--];
            } else {
                nums1[mergePoint--] = nums2[num2Point--];
            }
        }
        if (num2Point >= 0) {
            for (int i = 0; i <= num2Point; i++) {
                nums1[i] = nums2[i];
            }
        }

    }
}
