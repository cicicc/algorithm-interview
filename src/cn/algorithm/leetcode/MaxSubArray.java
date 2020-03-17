package cn.algorithm.leetcode;

/**
 * @Description 最大子序和
 * 题目： leetcode53题-最大子序和
 * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 * 示例：
 * 输入: [-2,1,-3,4,-1,2,1,-5,4],
 * 输出: 6
 * 解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
 * 解题思路：
 * 使用变量MaxSum存储当前的最大值，另一个变量currentSum不停的累加数组中的每一个数，
 * if(currentSum > maxSum) {maxSum = currentSum};
 * if(currentSum <0){currentSum = 0};
 * @Author: HaiBo Chen
 * @Date: 2020/3/8
 * @Time: 3:09 下午
 */
public class MaxSubArray {

    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        int currentSum = 0;
        int maxSum = nums[0];
        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];
            if (maxSum < currentSum) {
                maxSum = currentSum;
            }
            if (currentSum < 0) {
                currentSum = 0;
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(new MaxSubArray().maxSubArray(nums));
    }


}
