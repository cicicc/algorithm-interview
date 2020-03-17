package cn.algorithm.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Description 二叉树的层次遍历
 * 题目描述:
 * 给定一个二叉树，返回其按层次遍历的节点值。 （即逐层地，从左到右访问所有节点）。
 * <p>
 * 例如:
 * 给定二叉树: [3,9,20,null,null,15,7],
 * <p>
 * 3
 * / \
 * 9  20
 * /  \
 * 15   7
 * 返回其层次遍历结果：
 * <p>
 * [
 * [3],
 * [9,20],
 * [15,7]
 * ]
 * 解题思路：
 * 从根节点开始，将当前层的所有节点从左到右依次放入数组中，遍历完当前层数据，再遍历下一层数据
 * 时间/空间复杂度
 * 时间复杂度 O(n)，空间复杂度O(n)
 * @Author: HaiBo Chen
 * @Date: 2020/3/17
 * @Time: 7:20 下午
 */
public class LevelOrder {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

        if (root == null) {
            return result;
        }
        result.add(Arrays.asList(root.val));
        List<TreeNode> needTraverNode = Arrays.asList(root);
        while (needTraverNode.size() > 0) {
            List<TreeNode> currentLayerNodes = new ArrayList<>();
            List<Integer> currentLayerNodeValues = new ArrayList<>();
            for (TreeNode treeNode : needTraverNode) {
                if (treeNode.left != null) {
                    currentLayerNodes.add(treeNode.left);
                    currentLayerNodeValues.add(treeNode.left.val);

                }
                if (treeNode.right != null) {
                    currentLayerNodes.add(treeNode.right);
                    currentLayerNodeValues.add(treeNode.right.val);

                }

            }
            if (currentLayerNodeValues.size() > 0) {
                result.add(currentLayerNodeValues);
            }
            needTraverNode = currentLayerNodes;
        }

        return result;
    }


    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(3);
        treeNode.left = new TreeNode(9);
        TreeNode rigth = new TreeNode(20);
        rigth.left = new TreeNode(15);
        rigth.right = new TreeNode(7);
        treeNode.right = rigth;
        System.out.println(new LevelOrder().levelOrder(treeNode));
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}


