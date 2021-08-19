import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode.cn id=107 lang=java
 *
 * [107] 二叉树的层次遍历 II
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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        if(root == null ){
            return ans;
        }
        
        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
    
        while(queue.size()>0){
           int size = queue.size();
           List<Integer> temp = new ArrayList<Integer>();
           for(int i=0;i<size;i++){
               TreeNode t = queue.remove();
               temp.add(t.val);
               if(t.left!=null){
                   queue.add(t.left);
               }
               if(t.right!=null){
                   queue.add(t.right);
               }
           }
           ans.add(0,temp);
        }
        return ans;
    }
}
// @lc code=end

