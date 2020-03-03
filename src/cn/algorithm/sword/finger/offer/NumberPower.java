package cn.algorithm.sword.finger.offer;

/**
 * @Description 数值的整数次方
 * 题目：
 * 给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
 * 解题思路：
 * x的n次方，
 * 当n为偶数的时候等于（x*x）的n/2次方
 * 当n为基数的时候等于x*【（x*x）的（n-1）/2次方】
 * 由此可以利用递归的思路求解
 * @Author: HaiBo Chen
 * @Date: 2020/3/4
 * @Time: 12:02 上午
 */
public class NumberPower {
    public static double power(double base, int exponent) {
        if (exponent == 0) {
            return 1;
        }
        if (exponent == 1) {
            return base;
        }
        boolean isNegative = false;
        if (exponent < 0) {
            isNegative = true;
            exponent = -exponent;
        }
        double paw = power(base * base, exponent / 2);
        if (exponent % 2 == 1) {
            paw = base * paw;
        }
        return isNegative ? 1 / paw : paw;
    }
}
