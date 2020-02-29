package cn.algorithm.sword.finger.offer;

/**
 * @Description 二叉树的下一个节点
 * 题目
 * 给定一个二叉树和其中的一个节点，请找出中序遍历顺序的下一个节点并且返回，注意，书中的节点不仅包含左右子节点，同时包含指向父节点的指针
 * 解题思路
 * 如果一个节点的右子树不为空，那么该节点的下一个节点一定是其右子树的最左节点
 * 如果该节点不存在右子树，那么向上找第一个左节点指向该节点的祖先节点的节点
 * @Author: HaiBo Chen
 * @Date: 2020/2/29
 * @Time: 3:24 下午
 */
public class BinaryNextNode {

    public TreeLinkNode getNextNode4InOrder(TreeLinkNode pNode) {
        if (pNode.right != null) {
            TreeLinkNode node = pNode.right;
            while (node.left != null) {
                node = node.left;
            }
            return node;
        } else {
            while (pNode.parent != null) {
                TreeLinkNode parentNode = pNode.parent;
                if (parentNode.left == pNode) {
                    return parentNode;
                }
                pNode = pNode.parent;
            }
        }
        return null;
    }

}


class TreeLinkNode {
    int val;
    TreeLinkNode left = null;
    TreeLinkNode right = null;
    TreeLinkNode parent = null;

    public TreeLinkNode(int val) {
        this.val = val;
    }
}
