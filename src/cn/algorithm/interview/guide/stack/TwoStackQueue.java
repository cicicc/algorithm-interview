package cn.algorithm.interview.guide.stack;

import java.util.Stack;

/**
 * @Description 由两个栈组成的队列
 *     题目与要求：
 *        编写一个类，用两个栈组成队列，支持队列的基本操作（add、poll、peek）
 *      解法：
 *        使用两个栈，add数据的时候，先将数据放入栈1中，再将栈1的数据弹出并存入栈2，取数据时直接从栈2获取
 *      注意：
 *        栈2中有数据时，不可以将栈1数据弹出放入栈2！！！此解法中在调用poll/peek方法时判断栈2是否为空，如果为空将栈1数据弹出并压入栈2，都为空则抛出异常
 *      复杂度：
 *
 * @Author: HaiBo Chen
 * @Date: 2020/2/14
 * @Time: 11:42 上午
 */
public class TwoStackQueue {
    /**
     * 用作压栈数据顺序倒转的栈
     * add进入队列的数据先存入此栈
     */
    private Stack<Integer> stack4DataReverse;

    /**
     * 用作查询数据的栈
     * 存放数据对外表现为先add的数据在栈顶
     */
    private Stack<Integer> stack4DataObtain;

    public TwoStackQueue() {
        stack4DataObtain = new Stack<>();
        stack4DataReverse = new Stack<>();
    }

    public void add(int data) {
        stack4DataReverse.push(data);
    }

    public int poll() {
        if (stack4DataReverse.isEmpty() && stack4DataObtain.isEmpty()) {
            return -1;
        }
        if (stack4DataObtain.isEmpty()) {
            while (!stack4DataReverse.isEmpty()) {
                stack4DataObtain.push(stack4DataReverse.pop());
            }
        }
        return stack4DataObtain.pop();
    }

    public int peek() {
        if (stack4DataReverse.isEmpty() && stack4DataObtain.isEmpty()) {
            return -1;
        }
        if (stack4DataObtain.isEmpty()) {
            while (!stack4DataReverse.isEmpty()) {
                stack4DataObtain.push(stack4DataReverse.pop());
            }
        }
        return stack4DataObtain.peek();
    }

}
