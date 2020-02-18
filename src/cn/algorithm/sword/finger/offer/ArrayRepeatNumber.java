package cn.algorithm.sword.finger.offer;

/**
 * @Description 剑指offer--数组中重复的数字
 * 题目：
 * 在一个长度为n的数组里的所有数字都在0到n-1的范围内。 数组中某些数字是重复的，但不知道有几个数字是重复的。也不知道每个数字重复几次。
 * 请找出数组中任意一个重复的数字。 例如，如果输入长度为7的数组{2,3,1,0,2,5,3}，那么对应的输出是第一个重复的数字2。
 * 算法复杂度要求 时间复杂度 O(n) ，空间复杂度O(1)
 * <p>
 * 解题思路：
 * 将每个数放在数组的对应位置中，比如说2放在数组的第三个位置上，在设置值的时候比较要设置的值和位置上原有值，两个值如果相等则说明该值为重复数字
 * @Author: HaiBo Chen
 * @Date: 2020/2/18
 * @Time: 4:53 下午
 */
public class ArrayRepeatNumber {

    /**
     * 获取重复数字
     * 如果不存在重复数字 那么返回-1
     *
     * @return 数组中任意一个重复的数字
     */
    public int getRepeatNumber(int[] arr) {
        if (arr == null || arr.length < 2) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[arr[i]];
            if (arr[i] == temp) {
                return arr[i];
            }
            arr[arr[i]] = arr[i];
            arr[i] = temp;

        }
        return -1;
    }


}
