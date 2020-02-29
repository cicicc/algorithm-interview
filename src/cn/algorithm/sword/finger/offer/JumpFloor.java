package cn.algorithm.sword.finger.offer;

/**
 * @Description 跳台阶
 * 题目：
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）。
 * 思路：
 * 该题实际上就是斐波那契数列的一个小变种 {@link Fibonacci}
 * 如果有n级台阶
 * n = 1时，f(n)=1
 * n = 2时， fn) =2
 * n >2时，可根据青蛙最后是跳一级台阶，还是跳两级台阶进行区分，即f(n) = f(n-1)+f(n-2)
 *
 * 在斐波那契数列那题里面的解法中，提到常规递归会存在一个重复计算f(n)的问题，在此解法中，使用非递归写法，利用两个变量暂存f(n-1)和f(n-2)
 * 此方法也可以改成递归写法
 * @Author: HaiBo Chen
 * @Date: 2020/2/29
 * @Time: 4:26 下午
 */
public class JumpFloor {

    public static int jumpFloor(int n){
        if (n < 0) {
            return -1;
        } else if (n <= 2) {
            return n;
        }
        int pre2 = 0;
        int  pre1 = 1;
        int jumpWay = 0;
        for (int i = 2; i <=n ; i++) {
            jumpWay = pre2 + pre1;
            pre2 = pre1;
            pre1 = jumpWay;
        }
        return jumpWay;


    }
}
