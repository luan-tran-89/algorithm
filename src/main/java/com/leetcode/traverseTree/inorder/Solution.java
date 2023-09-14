package com.leetcode.traverseTree.inorder;

import com.leetcode.traverseTree.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Given the root of a binary tree, return the inorder traversal of its nodes' values.
 *
 * Example 1:
 * Input: root = [1,null,2,3]
 * Output: [1,3,2]
 *
 * Example 2:
 * Input: root = []
 * Output: []
 *
 * Example 3:
 * Input: root = [1]
 * Output: [1]
 *
 * @author gasieugru
 */
public class Solution {
    public static void main(String[] args) {
        Solution s = new Solution();

        TreeNode right = new TreeNode(2, new TreeNode(3), null);
        TreeNode root = new TreeNode(1, null, right);
        System.out.println(s.inorderTraversal(root));

        System.out.println(s.inorderTraversal(new TreeNode()));

        System.out.println(s.inorderTraversal(new TreeNode(1)));
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        this.inorderTraversal(root, result);
        return result;
    }

    public void inorderTraversal(TreeNode root, List<Integer> list) {
        if (root != null) {
            this.inorderTraversal(root.left, list);
            list.add(root.val);
            this.inorderTraversal(root.right, list);
        }
    }
}
