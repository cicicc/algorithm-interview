package cn.algorithm.sword.finger.offer;

/**
 * @Description 二叉树的镜像
 * 题目:
 * 操作给定的二叉树，将其变换为源二叉树的镜像。
 * 二叉树的镜像定义：源二叉树
 *     	    8
 *     	   /  \
 *     	  6   10
 *     	 / \  / \
 *     	5  7 9 11
 *     	镜像二叉树
 *     	    8
 *     	   /  \
 *     	  10   6
 *     	 / \  / \
 *     	11 9 7  5
 * 解题思路：
 * 调换左右节点，比如上面的二叉树就变成了
 *     	    8
 *     	   /  \
 *     	  10   6
 *     	 / \   / \
 *     	9  11 5  7
 *  再递归调用节点10和节点6的镜像
 * @Author: HaiBo Chen
 * @Date: 2020/3/6
 * @Time: 12:39 下午
 */
public class MirrorBinaryTree {
    public static void mirror(TreeNode root) {
        if (root == null) {
            return;
        }
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        mirror(root.left);
        mirror(root.right);
    }


}
