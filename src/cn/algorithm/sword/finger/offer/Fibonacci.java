package cn.algorithm.sword.finger.offer;

/**
 * @Description 斐波那契数列
 * 题目
 * 大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0）。n<=39
 * 解题思路
 * 什么是斐波那契数列呢
 * 对于数列的第n个，有如下规律
 * n =0 F(n)=0
 * n=1 F(n)=1
 * n >=2 F(n)= F(n-2)+F(n-1)
 * 需要注意的是，斐波那契数据增长的特别快，如果n大于40，可能会超出int取值范围
 *
 * 这里是最简单的递归实现，每个值都会变计算两次，可以使用数组来在第n位上存储f(n)的值
 * @Author: HaiBo Chen
 * @Date: 2020/2/29
 * @Time: 3:55 下午
 */
public class Fibonacci {

    public static int fibonacci(int n) {
        if (n < 0) {
            return -1;
        }
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

}
