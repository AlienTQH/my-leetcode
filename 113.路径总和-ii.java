import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode.cn id=113 lang=java
 *
 * [113] 路径总和 II
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
    List<List<Integer>> ans = new LinkedList();
    Stack<Integer> path = new Stack<>();
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        dfs(root, sum);
        return ans;
    }

    public void dfs(TreeNode root, int sum){
        if(root ==null) return;
        if(root.left==null&&root.right==null){
            path.push(root.val);
            if(root.val == sum){
                ans.add(new ArrayList(path));
            }
            path.pop();
            return;
        }
        path.push(root.val);
        if(root.left!=null) dfs(root.left, sum-root.val);
        if(root.right!=null) dfs(root.right, sum-root.val);
        path.pop();
    }
}
// @lc code=end

