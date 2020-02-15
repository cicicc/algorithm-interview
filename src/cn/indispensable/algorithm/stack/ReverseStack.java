package cn.indispensable.algorithm.stack;

import java.util.Stack;

/**
 * @Description  仅用递归函数和栈操作逆序一个栈
 *      要求：
 *          只允许使递归函数和栈操作
 *      思路：
 *          递归函数1，取出栈顶元素，如果是最后一个元素的话，那么就将元素重新push到栈中，
 *          如果不是最后一个元素，那么就再次调用递归函数后将此元素塞入栈中，作用不改变栈中其他元素位置的情况下，取出栈中最底下的元素
 *
 *          递归函数2：调用递归函数1，取出栈中最底下的数据，再次调用递归函数2，将调用递归函数1取出的栈中最底层数据塞入栈中
 * @Author: HaiBo Chen
 * @Date: 2020/2/14
 * @Time: 2:33 下午
 */
public class ReverseStack {


    /**
     * 注意 此方法未考虑栈对象为null的情况
     */
    private int getLastAndRemove(Stack<Integer> stack) {
        Integer result = stack.pop();
        if (stack.isEmpty()) {
            return result;
        } else {
            int last = getLastAndRemove(stack);
            stack.push(result);
            return last;

        }

    }

    public void reverseStack(Stack<Integer> stack) {
        if (stack == null || stack.isEmpty()) {
            return;
        }
        int lastElement = getLastAndRemove(stack);
        reverseStack(stack);
        stack.push(lastElement);
    }


    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        ReverseStack reverseStack = new ReverseStack();
        reverseStack.reverseStack(stack);
    }

}
