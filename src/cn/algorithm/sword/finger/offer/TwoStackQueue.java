package cn.algorithm.sword.finger.offer;

import java.util.NoSuchElementException;
import java.util.Stack;

/**
 * @Description 用两个栈实现队列
 * 题目描述：
 * 用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
 * 解题思路：
 * 栈是先入后出的，队列是先入先出的，使用两个栈来实现队列的话，那么可以先将push进来的数据放入栈1中，再将栈1中的数据依次pop并push进入栈2
 * 这样子就可以对栈1中的数据进行反转，达到先入先出的效果
 * @Author: HaiBo Chen
 * @Date: 2020/2/29
 * @Time: 3:41 下午
 */
public class TwoStackQueue {
    private Stack<Integer> inStack = new Stack<Integer>();
    private Stack<Integer> outStack = new Stack<Integer>();

    public void push(int node) {
        inStack.push(node);
    }

    public int pop() {
        if (outStack.isEmpty() && inStack.isEmpty()) {
            throw new NoSuchElementException();
        }
        if (outStack.isEmpty()) {
            while (!inStack.isEmpty()) {
                outStack.push(inStack.pop());
            }
        }

        return outStack.pop();


    }

}
