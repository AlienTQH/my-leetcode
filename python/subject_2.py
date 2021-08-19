'''
给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。

如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。

您可以假设除了数字 0 之外，这两个数都不会以 0 开头。

示例：

输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
输出：7 -> 0 -> 8
原因：342 + 465 = 807
'''
# Definition for singly-linked list.
class ListNode(object):
    def __init__(self, x):
        self.val = x
        self.next = None

class Solution(object):
    def addTwoNumbers(self, l1, l2):
        """
        :type l1: ListNode
        :type l2: ListNode
        :rtype: ListNode
        """
        p = l1
        q = l2
        l3 = ListNode(0)
        r = l3
        flag = 0
        while p and q:
            temp = p.val + q.val +flag
            if temp > 10:
                flag=1
            else:
                flag=0
            temp = temp%10
            res = ListNode(temp)
            p = p.next
            q = q.next
            r.next= res
            r = res

        if flag == 1:
            if p:
                while p:
                    p.val += flag
                    flag=0
                    r.next = p
                    p=p.next
            elif q:
                while q:
                    q.val += flag
                    flag = 0
                    r.next=q
                    q=q.next
            else:
                r.next=ListNode(1)

            r.next = ListNode(1)

        l3 = l3.next
        return l3

a = ListNode(1)
q = a
a.next= ListNode(2)
a.next.next = ListNode(3)
b = ListNode(1)
while q:
    print(q.val)
    q = q.next
# b.next= ListNode(2)
# b.next.next = ListNode(3)


# c = Solution()
# c.addTwoNumbers(a,b)





