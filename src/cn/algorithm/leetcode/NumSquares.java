package cn.algorithm.leetcode;

/**
 * @Description 279-完全平方数
 * 题目:
 * 给定正整数 n，找到若干个完全平方数（比如 1, 4, 9, 16, ...）使得它们的和等于 n。你需要让组成和的完全平方数的个数最少。
 *
 * 示例 1:
 *
 * 输入: n = 12
 * 输出: 3
 * 解释: 12 = 4 + 4 + 4.
 * 示例 2:
 *
 * 输入: n = 13
 * 输出: 2
 * 解释: 13 = 4 + 9.
 * 思路:
 * 使用动态规划解题，解题思路
 *
 *
 * @Author: HaiBo Chen
 * @Date: 2020/3/16
 * @Time: 4:44 下午
 */
public class NumSquares {

    public int numSquares(int n) {
        if (n < 1) {
            return -1;
        }

        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[0] = 0;
        for (int i = 2; i <= n; i++) {
            int res = i;
            for (int j = 1; i - j * j >= 0; j++) {
                res = Math.min(res, dp[i - j * j] + 1);
            }
            dp[i] = res;
        }
        return dp[n];
    }

    public static void main(String[] args) {
        NumSquares numSquares = new NumSquares();
        System.out.println(numSquares.numSquares(12));
    }
}
