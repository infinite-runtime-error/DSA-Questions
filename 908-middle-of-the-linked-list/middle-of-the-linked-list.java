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
    public ListNode middleNode(ListNode head) {

        // Simple Approach
        // ListNode temp = head;
        // int length = 0;
        // while(temp!=null)
        // {
        //     temp = temp.next;
        //     length++;
        // }

        // int half = length/2;
        // temp = head;
        // while(half-- > 0)
        // {
        //     temp = temp.next;
        // }
        // return temp;

        // Slow And Fast Approach
        ListNode slow = head;
        ListNode fast = head;

        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }

        return slow;


    }
}