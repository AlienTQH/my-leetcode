import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode.cn id=103 lang=java
 *
 * [103] 二叉树的锯齿形层次遍历
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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        if(root == null ){
            return ans;
        }
        
        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        int layer=0;
        while(queue.size()>0){
            layer += 1;
            int size = queue.size();
            List<Integer> temp = new ArrayList<Integer>();
            for(int i=0;i<size;i++){
                TreeNode t = queue.remove();
                if(layer%2==0){
                    temp.add(0,t.val);
                }
                else
                {
                    temp.add(t.val);
                }
                
                if(t.left!=null){
                    queue.add(t.left);
                }
                if(t.right!=null){
                    queue.add(t.right);
                }
            }
            ans.add(temp);
         }
        return ans;
    }
}
// @lc code=end

