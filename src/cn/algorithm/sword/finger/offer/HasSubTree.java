package cn.algorithm.sword.finger.offer;

/**
 * @Description 树的子结构
 * 题目描述：
 * 输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）
 * 解题思路：
 * 递归解决此问题，此处抽出一个方法进行递归的原因是，存在特例也就是空树不是任意一个树的子结构
 * @Author: HaiBo Chen
 * @Date: 2020/3/5
 * @Time: 6:54 下午
 */
public class HasSubTree {

    public static boolean hasSubTree(TreeNode root1, TreeNode root2) {
        if (root1 == null || root2 == null) {
            return false;
        }

        return isSubTree(root1, root2);
    }

    static boolean isSubTree(TreeNode root1, TreeNode root2) {
        if (root2 == null) {
            return true;
        }

        if (root1 == null) {
            return false;
        }
        if (root1.val == root2.val) {
            if (isSubTree(root1.left, root2.left)
                    && isSubTree(root1.right, root2.right)) {
                return true;
            }
        }
        return isSubTree(root1.left, root2) || isSubTree(root1.right, root2);

    }
}
