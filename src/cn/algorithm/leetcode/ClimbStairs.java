package cn.algorithm.leetcode;

/**
 * @Description 70.爬楼梯
 * 题目：
 * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 * <p>
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 * <p>
 * 注意：给定 n 是一个正整数。
 * <p>
 * 解题思路：
 * 使用动态规划解题，引入数组暂存中间结果
 * 时空复杂度：
 * 时间复杂度O(n),空间复杂度O(n)
 * @Author: HaiBo Chen
 * @Date: 2020/3/10
 * @Time: 11:12 下午
 */
public class ClimbStairs {
    public int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 2] + dp[i - 1];
        }
        return dp[n];
    }

}
