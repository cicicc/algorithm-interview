package cn.algorithm.sword.finger.offer;

import java.util.Stack;

/**
 * @Description 包含min函数的栈
 * 题目：
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈中所含最小元素的min函数（时间复杂度应为O（1））。
 * 注意：保证测试中不会当栈为空的时候，对栈调用pop()或者min()或者top()方法。
 * 解题思路：
 *     解法1：
 *         使用两个栈，栈1正常记录数据，栈2记录栈1中最小数据放在栈顶。
 *         push：正常push至栈1，如果栈2栈顶数据小于等于需要push的数据，不对栈2进行操作，否则将需要push的数据同时push入栈2
 *         pop： 正常从栈1中弹出，如果栈2栈顶数据不等于需要弹出的数据，不对栈2进行操作，否则弹出栈2栈顶数据
 *         getMin: 返回栈2栈顶数据
 *     解法2：
 *         除push、pop操作，其余操作与解法1完全一致
 *         push：正常push至栈1，如果栈2栈顶数据小于等于需要push的数据，将栈2栈顶数据push进栈2，否则将需要push的数据同时push入栈2
 *         pop： 正常从栈1栈2中弹出栈顶数据
 *     复杂度分析：
 *         pop、push、getMin功能操作的时间复杂度都为O(1)
 *     解法1和解法2区别：
 *        解法1比解法2省空间（栈2数据更少），但是多花一点时间（pop操作多判断一次）
 *
 *   代码以解法2为例
 *
 * @Author: HaiBo Chen
 * @Date: 2020/3/6
 * @Time: 11:51 下午
 */
public class MinStack {

    private Stack<Integer> stack1 = new Stack<>();
    private Stack<Integer> stack2 = new Stack<>();

    public void push(int node) {
        stack1.push(node);
        if (stack2.isEmpty() || stack2.peek() > node) {
            stack2.push(node);
        } else {
            stack2.push(stack2.peek());
        }
    }

    public void pop() {
        stack1.pop();
        stack2.pop();

    }

    public int top() {
        return stack1.peek();
    }

    public int min() {
        return stack2.peek();
    }

}
