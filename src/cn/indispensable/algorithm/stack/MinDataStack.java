package cn.indispensable.algorithm.stack;

import java.util.EmptyStackException;
import java.util.Objects;
import java.util.Stack;

/**
 * @Description 一个有getMin功能的栈
 *     题目： 实现一个特殊的栈，在实现栈的基本功能的基础上，再实现返回栈中最小元素的操作
 *     要求
 *         1. pop、push、getMin功能操作的时间复杂度都为O(1)
 *         2. 可使用现成的数据结构
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
 *   代码以解法1为例
 *
 *
 * @Author: HaiBo Chen
 * @Date: 2020/2/14
 * @Time: 11:11 上午
 */
public class MinDataStack {

    /**
     * 数据栈
     */
    private Stack<Integer> dataStack;

    /**
     * 最小栈
     */
    private Stack<Integer> minStack;

    public MinDataStack() {
        dataStack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int value) {
        if (minStack.isEmpty()) {
            minStack.push(value);
        } else {
            if (value < minStack.peek()) {
                minStack.push(value);
            }
        }
        dataStack.push(value);

    }

    public int pop() {
        if (dataStack.isEmpty()) {
            throw new EmptyStackException();
        }
        Integer dataStackTopElement = dataStack.pop();
        if (Objects.equals(minStack.peek(), dataStackTopElement)) {
            minStack.pop();
        }
        return dataStackTopElement;
    }

    public int getMin() {
        if (minStack.isEmpty()) {
            throw new EmptyStackException();
        }
        return minStack.peek();
    }

}
