package cn.algorithm.sword.finger.offer;

/**
 * @Description 矩形覆盖
 * 题目：
 * 我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
 * 解题思路：
 * 这个题目可以从最后一两个矩形怎么摆放进行思考，最后两个矩形在2*2的空间里面，只可能都横着放或者都竖着放
 * 如果最后一块是竖着放的，前面n-1块矩形的摆放就有就是f(n-1)种可能；
 * 如果最后两块是横着放的（一块横着放那么也需要一块和它一起横着放，填充2*2的空间），那么前n-2块矩形的摆放就用f(n-2)种可能
 * 所以这题实际上就是斐波那契数列
 * 也就是f(n)=n n<=2
 * f(n) = f(n-1)+f(n-2) n > 2
 * @Author: HaiBo Chen
 * @Date: 2020/2/29
 * @Time: 4:59 下午
 */
public class RectangleCover {

    public static int rectangleCover(int n) {
        if (n < 0) {
            return -1;
        } else if (n <= 2) {
            return n;
        } else {
            return rectangleCover(n - 2) + rectangleCover(n - 1);
        }

    }
}
