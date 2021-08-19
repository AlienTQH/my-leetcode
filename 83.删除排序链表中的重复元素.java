/*
 * @lc app=leetcode.cn id=83 lang=java
 *
 * [83] 删除排序链表中的重复元素
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
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null){
            return head;
        }
        ListNode p = head;
        ListNode q = head;
        while(p.next!=null){
            p = p.next;
            if(q.val == p.val){
                q.next = p.next;
            }
            else{
                q = p;
            }
        }
        return head;
        
    }
}
// @lc code=end

