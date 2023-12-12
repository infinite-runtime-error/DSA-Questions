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
    static int findLength(ListNode head)
    {
        int length = 0;
        ListNode temp = head;
        while(temp!=null)
        {
            length++;
            temp = temp.next;
        }
        return length;
    }
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null)return null;
        int length = findLength(head);
        int actualRotateK = (k % length);
        if(actualRotateK == 0)return head;

        int lastNodePosition = length - actualRotateK - 1;
        ListNode lastNode = head;
        for(int i=0;i<lastNodePosition;i++)
        {
            lastNode = lastNode.next;
        }
        ListNode newHead = lastNode.next;
        lastNode.next = null;

        ListNode iterate = newHead;
        while(iterate.next!=null)
        {
            iterate = iterate.next;
        }
        iterate.next = head;
        return newHead;
    }
}