package cn.algorithm.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description 138. 复制带随机指针的链表
 * 题目：
 * 给定一个链表，每个节点包含一个额外增加的随机指针，该指针可以指向链表中的任何节点或空节点。
 * <p>
 * 要求返回这个链表的 深拷贝。 
 * <p>
 * 我们用一个由 n 个节点组成的链表来表示输入/输出中的链表。每个节点用一个 [val, random_index] 表示：
 * <p>
 * val：一个表示 Node.val 的整数。
 * random_index：随机指针指向的节点索引（范围从 0 到 n-1）；如果不指向任何节点，则为  null 
 * <p>
 * 示例：
 * 输入：head = [[7,null],[13,0],[11,4],[10,2],[1,0]]
 * 输出：[[7,null],[13,0],[11,4],[10,2],[1,0]]
 * 解题思路：
 * 使用一个map保存当前节点
 * @Author: HaiBo Chen
 * @Date: 2020/3/8
 * @Time: 3:25 下午
 */
public class CopyRandomList {

    private Map<Node, Node> oldNodeAndNewNodeMap = new HashMap<>();

    public Node copyRandomList(Node head) {
        if (head == null) {
            return head;
        }
        if (oldNodeAndNewNodeMap.containsKey(head)) {
            return oldNodeAndNewNodeMap.get(head);
        }

        Node tempNode = new Node(head.val);
        oldNodeAndNewNodeMap.put(head, tempNode);
        tempNode.next = copyRandomList(head.next);
        tempNode.random = copyRandomList(head.random);

        return tempNode;
    }


}

class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}