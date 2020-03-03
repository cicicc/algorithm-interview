package cn.algorithm.sword.finger.offer;

/**
 * @Description 二进制中1的个数
 * 题目：
 *输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
 * 思路：
 * 使用n&(n-1),每次都可以去除最后一位1
 * 比如n 为 10110110
 * n-1为 10110101
 * n&(n-1) = 10110100
 *
 * @Author: HaiBo Chen
 * @Date: 2020/3/3
 * @Time: 11:55 下午
 */
public class NumberOfOneInBinary {

    public static int numberOf1(int n) {
        int number = 0;
        while(n!=0){
            n = n&(n-1);
            number++;
        }
        return number;
    }
}
