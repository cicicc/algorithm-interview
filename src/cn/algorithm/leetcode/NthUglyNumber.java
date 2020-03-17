package cn.algorithm.leetcode;

/**
 * @Description 264. 丑数 II
 * 题目描述：
 * 编写一个程序，找出第 n 个丑数。
 * <p>
 * 丑数就是只包含质因数 2, 3, 5 的正整数。
 * <p>
 * 示例:
 * <p>
 * 输入: n = 10
 * 输出: 12
 * 解释: 1, 2, 3, 4, 5, 6, 8, 9, 10, 12 是前 10 个丑数。
 * 说明:  
 * <p>
 * 1 是丑数。
 * n 不超过1690。
 * 解题思路：
 * 动态规划，动态转移方程
 * f(n) = 1, n=1;
 * f(n) = f(x)*2 || f(y)*3 || f(z)*5 n>=2
 * 时间/空间复杂度
 * 时间复杂度o(n),空间复杂度o(n)
 * @Author: HaiBo Chen
 * @Date: 2020/3/17
 * @Time: 9:56 上午
 */
public class NthUglyNumber {
    public int nthUglyNumber(int n) {
        int[] dp = new int[n + 1];
        dp[1] = 1;
        int point1 = 1;
        int point2 = 1;
        int point3 = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = Math.min(Math.min(dp[point1] * 2, dp[point2] * 3), dp[point3] * 5);
            if (dp[i] == dp[point1] * 2) {
                point1++;
            }
            if (dp[i] == dp[point2] * 3) {
                point2++;
            }
            if (dp[i] == dp[point3] * 5) {
                point3++;
            }

        }

        return dp[n];

    }


}
