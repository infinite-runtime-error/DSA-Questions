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
    static ListNode merge(ListNode list1, ListNode list2) {
        ListNode result = new ListNode(-1);
        ListNode t = result;

        if(list1 == null )return list2;
        if(list2 == null) return list1;

        while(list1!=null && list2!=null)
        {
            if(list1.val<=list2.val)
            {
                result.next = list1;
                list1 = list1.next;
                result = result.next;
            }

            else
            {
                result.next = list2;
                list2 = list2.next;
                result = result.next;
            }

        }

        while(list1 != null)
        {
                result.next = list1;
                list1 = list1.next;
                result = result.next;
        }

        while(list2 != null)
        {
                result.next = list2;
                list2 = list2.next;
                result = result.next;
        }

        return t.next;
    }
    static ListNode findMid (ListNode head)
    {
        ListNode slow = head;
        ListNode fast = head.next;

        while(fast!=null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null)
        {
            return head;
        }

        // Break into two halves using mid 
        ListNode mid = findMid(head);
        ListNode left = head;
        ListNode right = mid.next;
        mid.next = null;

        // Sort Recursively
        left = sortList(left);
        right = sortList(right);

        // Merging
        ListNode mergedLL = merge(left,right);
        return mergedLL;

    }
}