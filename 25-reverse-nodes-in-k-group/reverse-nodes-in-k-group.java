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
    static void reverse(ListNode start,ListNode end)
    {
        ListNode prev = null;
        ListNode current = start;
        ListNode nextNode = start.next;
        while(prev!=end)
        {
            current.next = prev;
            prev = current;
            current = nextNode;
            if(nextNode!=null)
            {
                nextNode=nextNode.next;
            }
        }
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode start = head;
        ListNode end = head;
        if(head==null || head.next==null || k==1)return head;
        int increment = k-1;
        while(increment-- > 0)
        {
            end = end.next;
            if(end==null)return head;
        }
        ListNode listLeft = end.next;
        ListNode nextHead = reverseKGroup(listLeft,k);
        reverse(start,end);
        start.next=nextHead;
        return end;
    }
}