import java.util.HashMap;

/*
 * @lc app=leetcode.cn id=106 lang=java
 *
 * [106] 从中序与后序遍历序列构造二叉树
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
    // 利用原理，后序遍历的最后一个节点就是根
    // 左右子树递归
    HashMap<Integer, Integer> map = new HashMap<>();//标记中序
    int[] postorder; //保留后序
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        this.postorder = postorder;
        for(int i = 0;i<inorder.length;i++){
            map.put(inorder[i], i);
        }
        return core(postorder.length-1, 0, inorder.length-1);

    }

    public TreeNode core(int post_root_idx, int in_left_idex, int in_right_idx){
        if(in_left_idex > in_right_idx){
            return null;
        }
        TreeNode root = new TreeNode(postorder[post_root_idx]);
        int idx = map.get(postorder[post_root_idx]);

        root.left = core(post_root_idx - (in_right_idx-idx)-1, in_left_idex, idx-1);
        root.right = core(post_root_idx-1, idx+1, in_right_idx);
        return root;
    }
}
// @lc code=end

