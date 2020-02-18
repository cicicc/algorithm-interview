package cn.algorithm.sword.finger.offer;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @Description 从尾到头打印链表
 * 题目：
 * 输入一个链表，按链表从尾到头的顺序返回一个ArrayList。
 * <p>
 * 解题思路：
 * 使用栈来作为中间变量，保存遍历到的节点信息，之后从栈中依次取出数据构建list
 * <p>
 * 复杂度分析：
 * 时间复杂度O(n),空间复杂度O(n)
 * @Author: HaiBo Chen
 * @Date: 2020/2/19
 * @Time: 12:40 上午
 */
public class PrintListFromTailToHead {


    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        if (listNode == null) {
            return new ArrayList<>();
        }

        Stack<Integer> tempStack = new Stack<>();
        ListNode currentListNode = listNode;
        tempStack.push(currentListNode.val);
        while (currentListNode.next != null) {
            currentListNode = currentListNode.next;
            tempStack.push(currentListNode.val);
        }

        ArrayList<Integer> result = new ArrayList<>();
        while (!tempStack.isEmpty()) {
            result.add(tempStack.pop());
        }
        return result;
    }
}


class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

