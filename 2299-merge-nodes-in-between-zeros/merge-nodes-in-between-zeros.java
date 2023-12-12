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
    public ListNode mergeNodes(ListNode head) {
        
        ListNode current = head;
        ListNode ans = new ListNode();
        ListNode temp = ans;

        int sum = 0;
        int count = 0;

        while(current != null)
        {
            if(current.val == 0)
            {
                count++;
            }
            else
            {
                sum = sum + current.val;
            }
            if(count == 2)
            {
                ListNode node = new ListNode(sum);
                ans.next = node;
                ans = ans.next;
                
                sum = 0;
                count = 1;
            }
            current = current.next;
        }

      

        return temp.next;

    }
}