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
    public Node copyRandomList(Node head) {
         Node iter = head, front = head;
        Node copy = head;
        // Making Deep Copy Nodes
        while (iter != null) {
            front = iter.next;
            copy = new Node(iter.val);
            iter.next = copy;
            copy.next = front;
            iter = front;
        }

        iter = head;
        // Mapping original with deep copies
        while (iter != null) {
            if (iter.random != null) {
                iter.next.random = iter.random.next;
            }
            iter = iter.next.next;
        }

        // Getting original linked list with aid of deep copy
        iter = head;
        Node dummy = new Node(0);
        copy = dummy;

        while (iter != null) {
            front = iter.next.next;
            copy.next = iter.next;
            iter.next = front;
            copy = copy.next;
            iter = iter.next;
        }

        return dummy.next;
    }
}