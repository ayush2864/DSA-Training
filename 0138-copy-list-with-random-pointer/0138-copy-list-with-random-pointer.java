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

import java.util.HashMap;

class Solution {
    public Node copyRandomList(Node head) {

        if (head == null)
            return null;

        HashMap<Node, Node> map = new HashMap<>();

        // Step 1: Copy all nodes
        Node curr = head;

        while (curr != null) {
            map.put(curr, new Node(curr.val));
            curr = curr.next;
        }

        // Step 2: Connect next and random
        curr = head;

        while (curr != null) {

            map.get(curr).next = map.get(curr.next);
            map.get(curr).random = map.get(curr.random);

            curr = curr.next;
        }

        return map.get(head);
    }
}