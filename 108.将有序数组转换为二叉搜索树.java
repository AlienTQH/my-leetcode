/*
 * @lc app=leetcode.cn id=108 lang=java
 *
 * [108] 将有序数组转换为二叉搜索树
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
    public TreeNode sortedArrayToBST(int[] nums) {
        return newCore(nums, 0, nums.length-1);
    }
    
    // 时间复杂度 O(n)
    // 空间复杂度 O(logn)
    public TreeNode newCore(int[] nums, int left,int right){
        if(left > right){
            return null;
        }

        // 总是选择中间位置左边的数字作为根节点
        int mid = (left+right)/2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = newCore(nums, left, mid-1);
        node.right = newCore(nums, mid+1, right);
        return node;
    }

    // 时间复杂度 O(n)
    // 空间复杂度 O(logn)
    public TreeNode core(int[] nums){
        int len = nums.length;
        if(len<=0) return null;
        if(len==1){
            TreeNode node = new TreeNode(nums[0]);
            node.left = null;
            node.right = null;
            return node;
        }
        
        // 时间复杂度 O(n*n)???
        // 空间复杂度 O(n*n)
        TreeNode node = new TreeNode(nums[len/2]);
        node.left = null;
        node.right = null;
        int left_len = len/2 -1+1;
        int right_len = len - (len/2+1);
        if(left_len > 0){
            System.out.println(left_len);
            int[] left_nums = new int[left_len];
            System.arraycopy(nums, 0, left_nums, 0, left_len);
            System.out.println(Arrays.toString(left_nums));
            node.left = core(left_nums);
            
        }
        if(right_len>0){
            System.out.println(right_len);
            int[] right_nums = new int[right_len];
            System.arraycopy(nums, len/2+1, right_nums, 0, right_len);
            System.out.println(Arrays.toString(right_nums));
            node.right = core(right_nums);
        }
        
        return node;
    }

}
// @lc code=end

