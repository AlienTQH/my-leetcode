/*
 * @lc app=leetcode.cn id=109 lang=java
 *
 * [109] 有序链表转换二叉搜索树
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
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
    public TreeNode sortedListToBST(ListNode head) {
        int len = 0;
        ListNode p = head;
        while(p!=null){
            len++;
            p=p.next;
        }
        int[] nums = new int[len];
        p = head;
        int i=0;
        while(p!=null){
            nums[i] = p.val;
            i++;
            p=p.next;
        }
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
}
// @lc code=end

