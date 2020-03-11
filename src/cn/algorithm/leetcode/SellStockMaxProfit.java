package cn.algorithm.leetcode;

/**
 * @Description 121. 买卖股票的最佳时机
 * 题目：
 * <p>
 * 给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
 * 如果你最多只允许完成一笔交易（即买入和卖出一支股票），设计一个算法来计算你所能获取的最大利润。注意你不能在买入股票前卖出股票。
 * 示例 1:
 * <p>
 * 输入: [7,1,5,3,6,4]
 * 输出: 5
 * 解释: 在第 2 天（股票价格 = 1）的时候买入，在第 5 天（股票价格 = 6）的时候卖出，最大利润 = 6-1 = 5 。
 * 注意利润不能是 7-1 = 6, 因为卖出价格需要大于买入价格。
 * 示例 2:
 * <p>
 * 输入: [7,6,4,3,1]
 * 输出: 0
 * 解释: 在这种情况下, 没有交易完成, 所以最大利润为 0。
 * <p>
 * 解题思路：
 * 假设我们在第i天买入，第j (j > i)天卖出股票，获得的利润是prices[j] - prices[i].
 * 记j - i = k，那么由于数学关系式可知：
 * prices[j] - prices[i] = (prices[j] - prices[i+k-1]) + (prices[i+k-1] - prices[i+k-1]) + .... + (prices[i+1] - prices[i])
 * 那么知道每一个prices[i+1] - prices[i]后本题求max(prices[j] - prices[i])可以转换为求最大连续子数组和的问题
 * 如股票价格为[7,1,5,3,6,4]，则可以转换为求数组[-6, 4, -2, 3, -2]的最大连续子数组之和。
 * 时间/空间复杂度
 * 时间复杂度o(n)，空间复杂度o(n)
 * @Author: HaiBo Chen
 * @Date: 2020/3/11
 * @Time: 6:13 下午
 */
public class SellStockMaxProfit {


    public static int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2) {
            return 0;
        }

        int[] diff = new int[prices.length - 1];
        for (int i = 0; i < diff.length; i++) {
            diff[i] = prices[i + 1] - prices[i];
        }
        int temp = Math.max(0, diff[0]);
        int profile = temp;
        for (int i = 1; i < diff.length; i++) {
            temp = Math.max(temp + diff[i], 0);
            profile = Math.max(temp, profile);
        }

        return profile;
    }


}
