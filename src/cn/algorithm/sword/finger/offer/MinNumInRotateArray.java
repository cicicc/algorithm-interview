package cn.algorithm.sword.finger.offer;

/**
 * @Description 旋转数组中的最小数字
 * 题目描述：
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
 * 输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。
 * 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
 * NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
 * 解题思路：
 * 使用二分法来解题，比较中间数据和两边数据的大小，
 * @Author: HaiBo Chen
 * @Date: 2020/2/29
 * @Time: 8:39 下午
 */
public class MinNumInRotateArray {

    public static int minNumInRotateArray(int[] array) {
        if (array == null || array.length == 0) {
            return -1;
        }
        if (array.length == 1) {
            return array[0];
        }
        int start = 0;
        int end = array.length - 1;
        while (start < end) {
            int mid = (start + end) / 2;
            if (array[mid] <= array[end]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return array[start];

    }

}
