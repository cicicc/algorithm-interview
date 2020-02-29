package cn.algorithm.sword.finger.offer;

import java.util.Arrays;

/**
 * @Description 跳台阶升级版
 * 题目：
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
 * 思路：
 * 该题为跳台阶一题的一个小变种 {@link JumpFloor}
 * 如果有n级台阶
 * n = 1时，f(n)=1
 * n = 2时， fn) =2
 * n >2时，可根据青蛙最后是跳1-n级台阶进行区分，即f(n) = f(n-1)+f(n-2)+...f(1)+f(0)+1,最后的1表示一次跳n级台阶
 * @Author: HaiBo Chen
 * @Date: 2020/2/29
 * @Time: 4:26 下午
 */
public class JumpFloorUpdatedVersion {

    public static int jumpFloor(int target) {
        if (target < 0) {
            return -1;
        } else if (target <= 2) {
            return target;
        }

        int[] jumpWatArr = new int[target + 1];
        Arrays.fill(jumpWatArr, 1);
        jumpWatArr[1] = 1;
        jumpWatArr[2] = 2;
        for (int i = 3; i <= target; i++) {
            for (int j = 1; j < i; j++) {
                jumpWatArr[i] = jumpWatArr[i] + jumpWatArr[j];
            }

        }
        return jumpWatArr[target];

    }
}
