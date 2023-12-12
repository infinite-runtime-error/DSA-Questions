/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    static Node helper(Node head,Map<Node,Node> map)
    {
        if(head == null)return null;

        Node newHead = new Node(head.val);
        map.put(head,newHead);
        newHead.next = helper(head.next,map);
        if(head.random !=null)
        {
            Node random = head.random;
            newHead.random = map.get(random);
        }
        return newHead;
    }
    public Node copyRandomList(Node head) {
        Map<Node,Node> map = new HashMap<>();
        return helper(head,map);
    }
}