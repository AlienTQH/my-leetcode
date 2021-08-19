/*
 * @lc app=leetcode.cn id=21 lang=java
 *
 * [21] 合并两个有序链表
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null){
            return l2;
        }
        if(l2==null){
            return l1;
        }
        ListNode head = new ListNode();
        head.next = l1;
        l1 = head;
        ListNode p = l1;
        ListNode q = l1.next;
        while(l2!=null){
            ListNode temp = l2;
            l2 =l2.next; 
            while(q!=null){
                if(q.val>=temp.val){
                    p.next=temp;
                    temp.next = q;
                    p = temp;
                    break;
                }
                else{
                    p = q;
                    q = q.next;
                    }
            }
            if(q==null && temp !=null){
                p.next =temp;
                q = temp;
                if(l2!=null){
                    q.next = l2;
                    break;
                }
            }
            
        }
        return l1.next;
    }
}
// @lc code=end

