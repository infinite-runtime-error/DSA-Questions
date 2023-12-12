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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int ans[] = new int[2];
        ans[0]= -1;
        ans[1] = -1;

        if(head==null || head.next==null || head.next.next==null) return ans;

        ArrayList<Integer> arr = new ArrayList<>();
        

        ListNode prev = head;
        ListNode current = head.next;
        
        int idx = 1;

        while(current.next!=null){
            if(current.val>prev.val && current.val>current.next.val) arr.add(idx);
            if(current.val<prev.val && current.val<current.next.val) arr.add(idx);

            idx++;
            prev = current;
            current=current.next;
        }

       
        if(arr.size()<2) return ans;
        
        
        int min = Integer.MAX_VALUE;

        for(int i=1; i<arr.size(); i++){
            min = Math.min(arr.get(i)-arr.get(i-1),min);
        }
        
        ans[0] = min;
        ans[1] = arr.get(arr.size()-1) - arr.get(0);

        return ans;

    }
}