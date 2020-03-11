package cn.algorithm.leetcode;

/**
 * @Description 1013  将数组分成和相等的三个部分
 * 给你一个整数数组 A，只有可以将其划分为三个和相等的非空部分时才返回 true，否则返回 false。
 * <p>
 * 形式上，如果可以找出索引 i+1 < j 且满足 (A[0] + A[1] + ... + A[i] == A[i+1] + A[i+2] + ... + A[j-1] == A[j] + A[j-1] +
 * ... + A[A.length - 1]) 就可以将数组三等分。
 *
 * 时间/空间复杂度
 * 空间复杂度 O(1),时间复杂度O(n)
 * @Author: HaiBo Chen
 * @Date: 2020/3/11
 * @Time: 9:58 上午
 */
public class CanThreePartsEqualSum {
    public static boolean canThreePartsEqualSum(int[] A) {
        if (A == null || A.length < 3) {
            return false;
        }
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum += A[i];
        }
        if (sum % 3 != 0) {
            return false;
        }
        int arrEveryPart = sum / 3;
        int partCount = 0;
        int tempSum = 0;
        for (int i = 0; i < A.length; i++) {
            tempSum += A[i];
            if (tempSum == arrEveryPart) {
                partCount++;
                tempSum = 0;
            }
            if (partCount == 2 && i < A.length - 1) {
                return true;
            }
        }
        return partCount == 3;
    }

    public static void main(String[] args) {
        int[] arr = {10, -10, 10, -10, 10, -10, 10, -10};
        System.out.println(canThreePartsEqualSum(arr));
    }

}
