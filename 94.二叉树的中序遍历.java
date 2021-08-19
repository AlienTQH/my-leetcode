import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import javax.swing.text.AbstractDocument.LeafElement;

import javafx.scene.Node;

/*
 * @lc app=leetcode.cn id=94 lang=java
 *
 * [94] 二叉树的中序遍历
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans= new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        while(root!=null||stack.size()>0){
            while(root!=null){
                stack.add(root);
                root = root.left;
            }
            if(stack.size()>0){
                root = stack.pop();
                ans.add(root.val);
                root = root.right;
            }
        }
        return ans;
    }

}
// @lc code=end

